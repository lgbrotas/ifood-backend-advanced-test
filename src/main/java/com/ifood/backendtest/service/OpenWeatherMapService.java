package com.ifood.backendtest.service;

import com.ifood.backendtest.dto.open_weather_map.OpenWeatherMapResponseDto;
import com.ifood.backendtest.model.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

@Service
public class OpenWeatherMapService {
    private final RestTemplateBuilder restTemplateBuilder;

    @Value("${open.weather.map.weather.city.api.url}")
    private String weatherURL;

    @Autowired
    public OpenWeatherMapService(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplateBuilder = restTemplateBuilder;
    }

    public City requestWeatherByCity(String city){
        String finalUrl = this.weatherURL.replace("{city}", URLEncoder.encode(city, StandardCharsets.UTF_8)).replaceAll("\\s","");

        OpenWeatherMapResponseDto response = this.restTemplateBuilder.build().getForObject(finalUrl, OpenWeatherMapResponseDto.class);

        return new City.Builder().build();
    }
}
