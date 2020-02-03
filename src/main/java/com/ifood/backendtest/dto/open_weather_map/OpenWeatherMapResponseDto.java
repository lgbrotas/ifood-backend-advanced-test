package com.ifood.backendtest.dto.open_weather_map;

import com.fasterxml.jackson.annotation.JsonCreator;

import java.sql.Timestamp;
import java.util.List;
import java.util.Objects;

public class OpenWeatherMapResponseDto {
    private Integer id;
    private String name;
    private Integer cod;
    private String base;
    private Long visibility;
    private Long timezone;
    private Timestamp dt;
    private OpenWeatherMapCoordDto coord;
    private List<OpenWeatherMapWeatherDto> weather;
    private OpenWeatherMapMainDto main;
    private OpenWeatherMapWindDto wind;
    private OpenWeatherMapCloudsDto clouds;
    private OpenWeatherMapSysDto sys;

    public OpenWeatherMapResponseDto(){}

    public OpenWeatherMapResponseDto(Integer id, String name, Integer cod, String base, Long visibility, Long timezone, Timestamp dt, OpenWeatherMapCoordDto coord, List<OpenWeatherMapWeatherDto> weather, OpenWeatherMapMainDto main, OpenWeatherMapWindDto wind, OpenWeatherMapCloudsDto clouds, OpenWeatherMapSysDto sys) {
        this.id = id;
        this.name = name;
        this.cod = cod;
        this.base = base;
        this.visibility = visibility;
        this.timezone = timezone;
        this.dt = dt;
        this.coord = coord;
        this.weather = weather;
        this.main = main;
        this.wind = wind;
        this.clouds = clouds;
        this.sys = sys;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCod() {
        return cod;
    }

    public void setCod(Integer cod) {
        this.cod = cod;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public Long getVisibility() {
        return visibility;
    }

    public void setVisibility(Long visibility) {
        this.visibility = visibility;
    }

    public Long getTimezone() {
        return timezone;
    }

    public void setTimezone(Long timezone) {
        this.timezone = timezone;
    }

    public Timestamp getDt() {
        return dt;
    }

    public void setDt(Timestamp dt) {
        this.dt = dt;
    }

    public OpenWeatherMapCoordDto getCoord() {
        return coord;
    }

    public void setCoord(OpenWeatherMapCoordDto coord) {
        this.coord = coord;
    }

    public List<OpenWeatherMapWeatherDto> getWeather() {
        return weather;
    }

    public void setWeather(List<OpenWeatherMapWeatherDto> weather) {
        this.weather = weather;
    }

    public OpenWeatherMapMainDto getMain() {
        return main;
    }

    public void setMain(OpenWeatherMapMainDto main) {
        this.main = main;
    }

    public OpenWeatherMapWindDto getWind() {
        return wind;
    }

    public void setWind(OpenWeatherMapWindDto wind) {
        this.wind = wind;
    }

    public OpenWeatherMapCloudsDto getClouds() {
        return clouds;
    }

    public void setClouds(OpenWeatherMapCloudsDto clouds) {
        this.clouds = clouds;
    }

    public OpenWeatherMapSysDto getSys() {
        return sys;
    }

    public void setSys(OpenWeatherMapSysDto sys) {
        this.sys = sys;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OpenWeatherMapResponseDto that = (OpenWeatherMapResponseDto) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(name, that.name) &&
                Objects.equals(cod, that.cod) &&
                Objects.equals(base, that.base) &&
                Objects.equals(visibility, that.visibility) &&
                Objects.equals(timezone, that.timezone) &&
                Objects.equals(dt, that.dt) &&
                Objects.equals(coord, that.coord) &&
                Objects.equals(weather, that.weather) &&
                Objects.equals(main, that.main) &&
                Objects.equals(wind, that.wind) &&
                Objects.equals(clouds, that.clouds) &&
                Objects.equals(sys, that.sys);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, cod, base, visibility, timezone, dt, coord, weather, main, wind, clouds, sys);
    }
}
