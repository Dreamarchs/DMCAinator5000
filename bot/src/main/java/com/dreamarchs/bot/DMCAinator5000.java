package com.dreamarchs.bot;

import com.dreamarchs.discord.DiscordService;
import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DMCAinator5000 {

    public static Logger log = LoggerFactory.getLogger(DMCAinator5000.class);

    private final DiscordService discordService;
    @Inject
    public DMCAinator5000(DiscordService discordService) {
        this.discordService = discordService;
    }
    public void start() throws Exception {
        discordService.start();
    }
    public static void main(String[] args) {
        try {
            Injector injector = Guice.createInjector(DMCAinator5000ModuleProvider.getModules());
            DMCAinator5000 bot = injector.getInstance(DMCAinator5000.class);
            log.info("Coming online...");
            bot.start();
        }
        catch(Exception ex) {
            log.error("Entered error state: ", ex);
        }
    }
}
