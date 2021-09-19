package com.dreamarchs.bot;

import com.dreamarchs.discord.DiscordCredentials;
import com.google.inject.Provider;

public class FileDiscordCredentialsProvider implements Provider<DiscordCredentials> {

    //TODO: Read this from disk, for now Deven just put your key in here
    private final String apiToken = "ODg4OTMzNjEwMDM4NjU3MDc0.YUZ58A.KZ3m_3C8jcQ0SOld1X9MrV9JKGE";

    @Override
    public DiscordCredentials get() {
        return new DiscordCredentials(apiToken);
    }
}
