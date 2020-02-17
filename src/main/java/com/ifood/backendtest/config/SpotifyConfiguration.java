package com.ifood.backendtest.config;

import com.ifood.backendtest.dto.spotify.SpotifyTokenDto;
import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.*;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

@Configuration
public class SpotifyConfiguration {


    private final RestTemplateBuilder restTemplateBuilder;

    private SpotifyTokenDto token;

    @Value("${spotify.client.id}")
    private String clientId;

    @Value("${spotify.client.secret}")
    private String clientSecret;

    public SpotifyTokenDto getToken(){
        return this.token;
    }

    @Autowired
    public SpotifyConfiguration(RestTemplateBuilder restTemplateBuilder) {

        this.restTemplateBuilder = restTemplateBuilder;
    }

    private void setInitialConfigurationSpotify(){
        String base64EncodedAuthorization = new String(Base64.encodeBase64(
                clientId.concat(":").concat(clientSecret).getBytes()
        ));

        MultiValueMap<String, String> body = new LinkedMultiValueMap<String, String>();
        body.add("grant_type", "client_credentials");

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
        headers.add("Authorization", "Basic ".concat(base64EncodedAuthorization));

        HttpEntity<MultiValueMap<String, String>> entity = new HttpEntity<>(body, headers);

        this.token = restTemplateBuilder.build().exchange(
            "https://accounts.spotify.com/api/token",
            HttpMethod.POST,
            entity,
            SpotifyTokenDto.class
        ).getBody();
    }

    @Bean
    public void renewToken(){
        Runnable tokenRunnable = () -> {
            setInitialConfigurationSpotify();
        };

        ScheduledExecutorService exec = Executors.newScheduledThreadPool(1);
        exec.scheduleAtFixedRate(tokenRunnable , 0, 50, TimeUnit.MINUTES);
    }
}
