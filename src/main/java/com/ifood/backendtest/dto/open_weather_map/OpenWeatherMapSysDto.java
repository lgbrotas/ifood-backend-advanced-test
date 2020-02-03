package com.ifood.backendtest.dto.open_weather_map;

import com.fasterxml.jackson.annotation.JsonCreator;

import java.sql.Timestamp;
import java.util.Objects;

public class OpenWeatherMapSysDto {

    private Integer id;
    private Integer type;
    private String country;
    private Timestamp sunrise;
    private Timestamp sunset;

    public OpenWeatherMapSysDto(){}

    public OpenWeatherMapSysDto(Integer id, Integer type, String country, Timestamp sunrise, Timestamp sunset) {
        this.id = id;
        this.type = type;
        this.country = country;
        this.sunrise = sunrise;
        this.sunset = sunset;
    }

    public Integer getId() {
        return id;
    }

    public Integer getType() {
        return type;
    }

    public String getCountry() {
        return country;
    }

    public Timestamp getSunrise() {
        return sunrise;
    }

    public Timestamp getSunset() {
        return sunset;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setSunrise(Timestamp sunrise) {
        this.sunrise = sunrise;
    }

    public void setSunset(Timestamp sunset) {
        this.sunset = sunset;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OpenWeatherMapSysDto that = (OpenWeatherMapSysDto) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(type, that.type) &&
                Objects.equals(country, that.country) &&
                Objects.equals(sunrise, that.sunrise) &&
                Objects.equals(sunset, that.sunset);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, type, country, sunrise, sunset);
    }

}
