package com.dreamarchs.discord;

public class DiscordCredentials {
    private final String apiKey;

    //TODO: Safe delete the API key when we're done
    public String consumeApiKey() {
        return apiKey;
    }

    public DiscordCredentials(String apiKey) {
        this.apiKey = apiKey;
    }
}
