package com.aibles.oauth2.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class KeycloakResponse {

    @JsonProperty("access_token")
    private String accessToken;

    public KeycloakResponse() {
    }

    public KeycloakResponse(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }
}
