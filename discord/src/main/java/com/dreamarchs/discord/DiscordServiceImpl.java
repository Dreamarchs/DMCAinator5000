package com.dreamarchs.discord;

import com.dreamarchs.common.ServiceStatus;
import com.dreamarchs.common.StatusService;
import com.google.inject.Inject;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DiscordServiceImpl implements DiscordService {

    public static Logger log = LoggerFactory.getLogger(DiscordServiceImpl.class);

    private final DiscordCredentials credentials;
    private final DiscordEventListener eventListener;
    private final StatusService statusService;

    private JDA discordApi;

    @Inject
    //TODO: Safe destroy credentials after initialization of the service
    public DiscordServiceImpl(DiscordCredentials credentials,
                              DiscordEventListener eventListener,
                              StatusService statusService) {
        this.credentials = credentials;
        this.eventListener = eventListener;
        this.statusService = statusService;
        statusService.setServiceStatus(DiscordServiceImpl.class, ServiceStatus.PENDING);
    }

    @Override
    public void start() throws Exception {
        discordApi = JDABuilder.createDefault(credentials.consumeApiKey())
                .addEventListeners(eventListener)
                .build();
        discordApi.awaitStatus(JDA.Status.CONNECTED);
        if(discordApi.getStatus() != JDA.Status.CONNECTED) {
            statusService.setServiceStatus(DiscordServiceImpl.class, ServiceStatus.ERROR);
        }
        statusService.setServiceStatus(DiscordServiceImpl.class, ServiceStatus.OK);
    }

    @Override
    public void sendMessage(long userId, String message) {

    }

    @Override
    public User getUser(long userId) {
        return null;
    }
}
