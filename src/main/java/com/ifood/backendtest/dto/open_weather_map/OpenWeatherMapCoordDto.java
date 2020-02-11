package com.ifood.backendtest.dto.open_weather_map;


import java.util.Objects;

public class OpenWeatherMapCoordDto {

    private float lon;
    private float lat;

    public OpenWeatherMapCoordDto(float lon, float lat) {
        this.lon = lon;
        this.lat = lat;
    }

    public float getLon() {
        return lon;
    }

    public float getLat() {
        return lat;
    }

    public void setLon(float lon) {
        this.lon = lon;
    }

    public void setLat(float lat) {
        this.lat = lat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OpenWeatherMapCoordDto that = (OpenWeatherMapCoordDto) o;
        return Objects.equals(lon, that.lon) &&
                Objects.equals(lat, that.lat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lon, lat);
    }
}
