package com.ifood.backendtest.service;

import com.ifood.backendtest.dto.CityDto;
import com.ifood.backendtest.model.TrackSuggestion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TrackSuggestionService {

    private final OpenWeatherMapService openWeatherMapService;
    private final SpotifyService spotifyService;

    @Autowired
    public TrackSuggestionService(OpenWeatherMapService openWeatherMapService, SpotifyService spotifyService) {
        this.openWeatherMapService = openWeatherMapService;
        this.spotifyService = spotifyService;
    }

    public TrackSuggestion managerTrackSuggestion(CityDto location){
        TrackSuggestion trackSuggestion = new TrackSuggestion.Builder().setCity(
            openWeatherMapService.manageOpenWeatherRequest(location)
        ).build();

        trackSuggestion.proccessTrackType();

        spotifyService.testSpotiftGetToken();

        return trackSuggestion;
    }
}
