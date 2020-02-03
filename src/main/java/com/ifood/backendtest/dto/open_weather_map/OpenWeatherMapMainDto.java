package com.ifood.backendtest.dto.open_weather_map;

import com.fasterxml.jackson.annotation.JsonCreator;

import java.util.Objects;

public class OpenWeatherMapMainDto {

    private Long temp;
    private Long feelsLike;
    private Long tempMin;
    private Long tempMax;
    private Long pressure;
    private Long humidity;

    public OpenWeatherMapMainDto(){}

    public OpenWeatherMapMainDto(Long temp, Long feelsLike, Long tempMin, Long tempMax, Long pressure, Long humidity) {
        this.temp = temp;
        this.feelsLike = feelsLike;
        this.tempMin = tempMin;
        this.tempMax = tempMax;
        this.pressure = pressure;
        this.humidity = humidity;
    }

    public Long getTemp() {
        return temp;
    }

    public Long getFeelsLike() {
        return feelsLike;
    }

    public Long getTempMin() {
        return tempMin;
    }

    public Long getTempMax() {
        return tempMax;
    }

    public Long getPressure() {
        return pressure;
    }

    public Long getHumidity() {
        return humidity;
    }

    public void setTemp(Long temp) {
        this.temp = temp;
    }

    public void setFeelsLike(Long feelsLike) {
        this.feelsLike = feelsLike;
    }

    public void setTempMin(Long tempMin) {
        this.tempMin = tempMin;
    }

    public void setTempMax(Long tempMax) {
        this.tempMax = tempMax;
    }

    public void setPressure(Long pressure) {
        this.pressure = pressure;
    }

    public void setHumidity(Long humidity) {
        this.humidity = humidity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OpenWeatherMapMainDto that = (OpenWeatherMapMainDto) o;
        return Objects.equals(temp, that.temp) &&
                Objects.equals(feelsLike, that.feelsLike) &&
                Objects.equals(tempMin, that.tempMin) &&
                Objects.equals(tempMax, that.tempMax) &&
                Objects.equals(pressure, that.pressure) &&
                Objects.equals(humidity, that.humidity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(temp, feelsLike, tempMin, tempMax, pressure, humidity);
    }

}
