package com.ifood.backendtest.model;

import java.util.Objects;

public class City {

    private String name;
    private Long latitude;
    private Long longitude;
    private Temperature temperature;

    private City(String name, Long latitude, Long longitude, Temperature temperature) {
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;
        this.temperature = temperature;
    }

    public String getName() {
        return name;
    }

    public Long getLatitude() {
        return latitude;
    }

    public Long getLongitude() {
        return longitude;
    }

    public Temperature getTemperature() {
        return temperature;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city = (City) o;
        return Objects.equals(name, city.name) &&
                Objects.equals(latitude, city.latitude) &&
                Objects.equals(longitude, city.longitude) &&
                Objects.equals(temperature, city.temperature);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, latitude, longitude, temperature);
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                ", temperature=" + temperature +
                '}';
    }

    public static final class Builder {
        private String name;
        private Long latitude;
        private Long longitude;
        private Temperature temperature;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setLatitude(Long latitude) {
            this.latitude = latitude;
            return this;
        }

        public Builder setLongitude(Long longitude) {
            this.longitude = longitude;
            return this;
        }

        public Builder setTemperature(Temperature temperature){
            this.temperature = temperature;
            return this;
        }

        public City build(){
            return new City(name, latitude, longitude, temperature);
        }
    }
}