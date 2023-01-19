package com.github.snotest;

import org.javacord.api.DiscordApi;
import org.javacord.api.DiscordApiBuilder;

public class Main {
    String token = "<insert token here>";

    DiscordApi api = new DiscordApiBuilder().setToken(token).login().join();
    // Add a listener which answers with "Pong!" if someone writes "!ping"
        api.addMessageCreateListener(event ->
    {
        if (event.getMessageContent().equalsIgnoreCase("!ping")) {
            event.getChannel().sendMessage("Pong!");
        }
    });
}
