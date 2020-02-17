package com.ifood.backendtest.service;

import com.ifood.backendtest.config.SpotifyConfiguration;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class SpotifyService {

    private SpotifyConfiguration spotifyConfiguration;

    @Value("${spotify.client.id}")
    private String clientId;

    @Value("${spotify.client.secret}")
    private String clientSecret;

    public SpotifyService(SpotifyConfiguration spotifyConfiguration) {
        this.spotifyConfiguration = spotifyConfiguration;
    }

    public void testSpotiftGetToken(){
        this.spotifyConfiguration.getToken();
    }
}
