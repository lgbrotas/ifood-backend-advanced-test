package com.ifood.backendtest.enums;

public enum TrackType {

    PARTY("Party Music"),
    POP("Pop Music"),
    ROCK("Rock Music"),
    CLASSICAL("Classical Music");

    private String internalDescription;

    TrackType(String description){
        this.internalDescription = description;
    }
}
