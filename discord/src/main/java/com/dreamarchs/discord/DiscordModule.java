package com.dreamarchs.discord;

import com.google.inject.AbstractModule;

public class DiscordModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(DiscordService.class).to(DiscordServiceImpl.class);
        bind(DiscordEventListener.class);
    }
}
