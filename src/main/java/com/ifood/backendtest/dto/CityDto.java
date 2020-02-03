package com.ifood.backendtest.dto;

import java.util.Objects;

public class CityDto {
    private String cityName;
    private Long latitude;
    private Long longitude;

    private CityDto(String cityName, Long latitude, Long longitude) {
        this.cityName = cityName;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public String getCityName() {
        return cityName;
    }

    public Long getLatitude() {
        return latitude;
    }

    public Long getLongitude() {
        return longitude;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CityDto cityDto = (CityDto) o;
        return Objects.equals(cityName, cityDto.cityName) &&
                Objects.equals(latitude, cityDto.latitude) &&
                Objects.equals(longitude, cityDto.longitude);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cityName, latitude, longitude);
    }

    public static final class Builder {
        private String cityName;
        private Long latitude;
        private Long longitude;

        public Builder setCityName(String cityName) {
            this.cityName = cityName;
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

        public CityDto build(){
            return new CityDto(cityName, latitude, longitude);
        }
    }
}
