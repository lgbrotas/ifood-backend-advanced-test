package com.ifood.backendtest.dto.open_weather_map;

import java.util.Objects;

public class OpenWeatherMapResponseDto {
    private Integer id;
    private String name;
    private Integer cod;
    private OpenWeatherMapCoordDto coord;
    private OpenWeatherMapMainDto main;

    public OpenWeatherMapResponseDto(Integer id, String name, Integer cod, String base, Long visibility, OpenWeatherMapCoordDto coord, OpenWeatherMapMainDto main) {
        this.id = id;
        this.name = name;
        this.cod = cod;
        this.coord = coord;
        this.main = main;
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

    public OpenWeatherMapCoordDto getCoord() {
        return coord;
    }

    public void setCoord(OpenWeatherMapCoordDto coord) {
        this.coord = coord;
    }

    public OpenWeatherMapMainDto getMain() {
        return main;
    }

    public void setMain(OpenWeatherMapMainDto main) {
        this.main = main;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OpenWeatherMapResponseDto that = (OpenWeatherMapResponseDto) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(name, that.name) &&
                Objects.equals(cod, that.cod) &&
                Objects.equals(coord, that.coord) &&
                Objects.equals(main, that.main);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, cod, coord, main);
    }
}
