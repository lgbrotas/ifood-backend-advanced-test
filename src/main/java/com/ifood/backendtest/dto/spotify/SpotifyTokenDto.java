package com.ifood.backendtest.dto.spotify;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class SpotifyTokenDto {

    @JsonProperty("access_token")
    private String accessToken;

    @JsonProperty("token_type")
    private String tokenType;

    @JsonProperty("expires_in")
    private Integer expiresIn;

    public SpotifyTokenDto(String accessToken, String tokenType, Integer expiresIn) {
        this.accessToken = accessToken;
        this.tokenType = tokenType;
        this.expiresIn = expiresIn;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getTokenType() {
        return tokenType;
    }

    public void setTokenType(String tokenType) {
        this.tokenType = tokenType;
    }

    public Integer getExpiresIn() {
        return expiresIn;
    }

    public void setExpiresIn(Integer expiresIn) {
        this.expiresIn = expiresIn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SpotifyTokenDto that = (SpotifyTokenDto) o;
        return Objects.equals(accessToken, that.accessToken) &&
                Objects.equals(tokenType, that.tokenType) &&
                Objects.equals(expiresIn, that.expiresIn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accessToken, tokenType, expiresIn);
    }
}
