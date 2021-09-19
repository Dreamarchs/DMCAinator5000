package com.dreamarchs.bot;

import com.dreamarchs.discord.DiscordModule;
import com.google.common.collect.Lists;
import com.google.inject.AbstractModule;

import java.util.Collection;

public class DMCAinator5000ModuleProvider {
    public static Collection<AbstractModule> getModules() {
        return Lists.newArrayList(
                new DMCAinator5000Module(),
                new DiscordModule()
        );
    }
}
