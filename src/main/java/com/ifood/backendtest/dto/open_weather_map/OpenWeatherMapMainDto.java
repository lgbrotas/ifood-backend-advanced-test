package com.ifood.backendtest.dto.open_weather_map;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class OpenWeatherMapMainDto {

    private float temp;
    @JsonProperty("feels_like")
    private float feelsLike;

    @JsonProperty("temp_min")
    private float tempMin;

    @JsonProperty("temp_max")
    private float tempMax;
    private float pressure;
    private float humidity;

    public OpenWeatherMapMainDto(float temp, float feelsLike, float tempMin, float tempMax, float pressure, float humidity) {
        this.temp = temp;
        this.feelsLike = feelsLike;
        this.tempMin = tempMin;
        this.tempMax = tempMax;
        this.pressure = pressure;
        this.humidity = humidity;
    }

    public float getTemp() {
        return temp;
    }

    public float getFeelsLike() {
        return feelsLike;
    }

    public float getTempMin() {
        return tempMin;
    }

    public float getTempMax() {
        return tempMax;
    }

    public float getPressure() {
        return pressure;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setTemp(float temp) {
        this.temp = temp;
    }

    public void setFeelsLike(float feelsLike) {
        this.feelsLike = feelsLike;
    }

    public void setTempMin(float tempMin) {
        this.tempMin = tempMin;
    }

    public void setTempMax(float tempMax) {
        this.tempMax = tempMax;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }

    public void setHumidity(float humidity) {
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
