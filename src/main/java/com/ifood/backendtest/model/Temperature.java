package com.ifood.backendtest.model;

import java.util.Objects;

public class Temperature {
    private double celsius;
    private double fahrenheit;
    private double kelvin;

    private Temperature(double celsius, double fahrenheit, double kelvin) {
        this.celsius = celsius;
        this.fahrenheit = fahrenheit;
        this.kelvin = kelvin;
    }

    public double getCelsius() {
        return celsius;
    }

    public double getFahrenheit() {
        return fahrenheit;
    }

    public double getKelvin() {
        return kelvin;
    }

    public Temperature convertTemperaturesUsingKelvin(){
        this.celsius = this.kelvin - 273.15;
        this.fahrenheit = (this.celsius * (9.0/5) + 32);
        return this;
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
        private double celsius;
        private double fahrenheit;
        private double kelvin;

        public Builder setCelsius(double celsius) {
            this.celsius = celsius;
            return this;
        }

        public Builder setFahrenheit(double fahrenheit) {
            this.fahrenheit = fahrenheit;
            return this;
        }

        public Builder setKelvin(double kelvin) {
            this.kelvin = kelvin;
            return this;
        }

        public Temperature build(){
            return new Temperature(celsius, fahrenheit, kelvin);
        }
    }
}
