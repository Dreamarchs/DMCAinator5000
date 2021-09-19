package com.dreamarchs.discord;

import com.google.common.eventbus.EventBus;
import com.google.inject.Inject;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DiscordEventListener extends ListenerAdapter {
    private static Logger logger = LoggerFactory.getLogger(DiscordEventListener.class);

    private final EventBus eventBus;

    @Inject
    public DiscordEventListener(EventBus eventBus) {
        this.eventBus = eventBus;
    }

    @Override
    public void onMessageReceived(MessageReceivedEvent event) {
        logger.debug("Message recieved from {}", event.getAuthor().getName());
        //Propagate this event back onto the event bus for someone else to pick up
        eventBus.post(event);
    }
}
