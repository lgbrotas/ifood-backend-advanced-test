package com.ifood.backendtest.dto.open_weather_map;

import com.fasterxml.jackson.annotation.JsonCreator;

import java.util.Objects;

public class OpenWeatherMapCloudsDto {

    private Long all;

    public OpenWeatherMapCloudsDto(){}

    public OpenWeatherMapCloudsDto(Long all) {
        this.all = all;
    }

    public Long getAll() {
        return all;
    }

    public void setAll(Long all) {
        this.all = all;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OpenWeatherMapCloudsDto that = (OpenWeatherMapCloudsDto) o;
        return Objects.equals(all, that.all);
    }

    @Override
    public int hashCode() {
        return Objects.hash(all);
    }

}
