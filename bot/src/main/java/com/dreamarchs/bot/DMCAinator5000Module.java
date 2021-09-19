package com.dreamarchs.bot;

import com.dreamarchs.common.SimpleStatusServiceImpl;
import com.dreamarchs.common.StatusService;
import com.dreamarchs.discord.DiscordCredentials;
import com.google.inject.AbstractModule;

public class DMCAinator5000Module extends AbstractModule {
    @Override
    protected void configure() {
        bind(StatusService.class).to(SimpleStatusServiceImpl.class);
        bind(DiscordCredentials.class).toProvider(FileDiscordCredentialsProvider.class);
    }
}
