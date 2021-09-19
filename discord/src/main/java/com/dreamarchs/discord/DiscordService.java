package com.dreamarchs.discord;

import net.dv8tion.jda.api.entities.User;

public interface DiscordService {
    void start() throws Exception;
    void sendMessage(long userId, String message);
    User getUser(long userId);
}
