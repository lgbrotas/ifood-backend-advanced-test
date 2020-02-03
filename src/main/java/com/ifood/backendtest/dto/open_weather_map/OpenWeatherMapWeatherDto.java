package com.ifood.backendtest.dto.open_weather_map;

import com.fasterxml.jackson.annotation.JsonCreator;

import java.util.Objects;

public class OpenWeatherMapWeatherDto {

    private Integer id;
    private String main;
    private String description;
    private String icon;

    public OpenWeatherMapWeatherDto(){}

    public OpenWeatherMapWeatherDto(Integer id, String main, String description, String icon) {
        this.id = id;
        this.main = main;
        this.description = description;
        this.icon = icon;
    }

    public Integer getId() {
        return id;
    }

    public String getMain() {
        return main;
    }

    public String getDescription() {
        return description;
    }

    public String getIcon() {
        return icon;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setMain(String main) {
        this.main = main;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OpenWeatherMapWeatherDto that = (OpenWeatherMapWeatherDto) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(main, that.main) &&
                Objects.equals(description, that.description) &&
                Objects.equals(icon, that.icon);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, main, description, icon);
    }

}
