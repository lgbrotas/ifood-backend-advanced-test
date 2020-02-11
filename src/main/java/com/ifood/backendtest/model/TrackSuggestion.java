package com.ifood.backendtest.model;

import com.ifood.backendtest.enums.TrackType;

import java.util.Objects;

public class TrackSuggestion {

    private TrackType trackType;
    private City city;

    public TrackSuggestion(City city) {
        this.city = city;
    }

    public TrackType getTrackType() {
        return trackType;
    }

    public void proccessTrackType() {
        double temperature = this.city.getTemperature().getCelsius();
        if (temperature > 30) {
            this.trackType  = TrackType.PARTY;
        }
        else if (temperature >= 15){
            this.trackType  = TrackType.POP;
        }
        else if(temperature >= 10) {
            this.trackType  = TrackType.ROCK;
        }
        else{
            this.trackType  = TrackType.CLASSICAL;
        }
    }

    public City getCity() {
        return city;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TrackSuggestion that = (TrackSuggestion) o;
        return trackType == that.trackType &&
                Objects.equals(city, that.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(trackType, city);
    }

    public static final class Builder {

        private City city;

        public Builder setCity(City city) {
            this.city = city;
            return this;
        }

        public TrackSuggestion build(){
            return new TrackSuggestion(city);
        }
    }
}
