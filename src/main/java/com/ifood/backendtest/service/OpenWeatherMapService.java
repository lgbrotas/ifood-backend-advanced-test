package com.ifood.backendtest.service;

import com.ifood.backendtest.dto.CityDto;
import com.ifood.backendtest.dto.open_weather_map.OpenWeatherMapResponseDto;
import com.ifood.backendtest.model.City;
import com.ifood.backendtest.model.Temperature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;

@Service
public class OpenWeatherMapService {
    private final RestTemplateBuilder restTemplateBuilder;

    @Value("${open.weather.map.weather.city.api.url}")
    private String weatherCityApiUrl;
    
    @Value("${open.weather.map.weather.geographic.coordinates.api.url}")
    private String weatherGeographicCoordinatesApiUrl;

    @Autowired
    public OpenWeatherMapService(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplateBuilder = restTemplateBuilder;
    }

    public  City manageOpenWeatherRequest(CityDto location){
        if (location.getLatitude() != null && location.getLongitude() != null) {
            return this.requestWeatherByGeographicCoordinates(location.getLatitude(), location.getLongitude());
        }
        return this.requestWeatherByCity(location.getCityName());
    }

    private City requestWeatherByCity(String city){
        String url = this.weatherCityApiUrl.replace("{city}", city.replace(" ", "+")).replaceAll("\\s","");

        return this.sendRequest(url);
    }

    private City requestWeatherByGeographicCoordinates(Long latitude, Long longitude){
        String url = this.weatherGeographicCoordinatesApiUrl.replace("{lat}", latitude.toString()).replace("{lon}", longitude.toString()).replaceAll("\\s","");

        return this.sendRequest(url);


    }

    private City sendRequest(String url) {
        OpenWeatherMapResponseDto response = this.restTemplateBuilder.build().getForObject(url, OpenWeatherMapResponseDto.class);

        Temperature temperature = new Temperature.Builder().setKelvin(response.getMain().getTemp()).build().convertTemperaturesUsingKelvin();


        return new City.Builder()
            .setName(response.getName())
            .setLatitude(response.getCoord().getLat())
            .setLongitude(response.getCoord().getLon())
            .setTemperature(temperature)
        .build();
    }
}
