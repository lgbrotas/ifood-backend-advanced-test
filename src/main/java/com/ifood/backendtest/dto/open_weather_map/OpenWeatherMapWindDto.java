package com.ifood.backendtest.dto.open_weather_map;

import com.fasterxml.jackson.annotation.JsonCreator;

import java.util.Objects;

public class OpenWeatherMapWindDto {

    private Long speed;
    private Long deg;

    public OpenWeatherMapWindDto(){};

    public OpenWeatherMapWindDto(Long speed, Long deg) {
        this.speed = speed;
        this.deg = deg;
    }

    public Long getSpeed() {
        return speed;
    }

    public Long getDeg() {
        return deg;
    }

    public void setSpeed(Long speed) {
        this.speed = speed;
    }

    public void setDeg(Long deg) {
        this.deg = deg;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OpenWeatherMapWindDto that = (OpenWeatherMapWindDto) o;
        return Objects.equals(speed, that.speed) &&
                Objects.equals(deg, that.deg);
    }

    @Override
    public int hashCode() {
        return Objects.hash(speed, deg);
    }

}
