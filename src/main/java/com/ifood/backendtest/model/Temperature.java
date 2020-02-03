package com.ifood.backendtest.model;

import java.util.Objects;

public class Temperature {
    private Float celsius;
    private Float fahrenheit;
    private Float kelvin;

    private Temperature(Float celsius, Float fahrenheit, Float kelvin) {
        this.celsius = celsius;
        this.fahrenheit = fahrenheit;
        this.kelvin = kelvin;
    }

    public Float getCelsius() {
        return celsius;
    }

    public Float getFahrenheit() {
        return fahrenheit;
    }

    public Float getKelvin() {
        return kelvin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Temperature that = (Temperature) o;
        return Objects.equals(celsius, that.celsius) &&
                Objects.equals(fahrenheit, that.fahrenheit) &&
                Objects.equals(kelvin, that.kelvin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(celsius, fahrenheit, kelvin);
    }

    @Override
    public String toString() {
        return "Temperature{" +
                "celsius=" + celsius +
                ", fahrenheit=" + fahrenheit +
                ", kevin=" + kelvin +
                '}';
    }

    public static final class Builder {
        private Float celsius;
        private Float fahrenheit;
        private Float kelvin;

        public Builder setCelsius(Float celsius) {
            this.celsius = celsius;
            return this;
        }

        public Builder setFahrenheit(Float fahrenheit) {
            this.fahrenheit = fahrenheit;
            return this;
        }

        public Builder setKelvin(Float kelvin) {
            this.kelvin = kelvin;
            return this;
        }

        public Temperature build(){
            return new Temperature(celsius, fahrenheit, kelvin);
        }
    }
}
