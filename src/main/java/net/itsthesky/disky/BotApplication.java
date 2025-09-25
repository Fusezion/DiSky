package net.itsthesky.disky;

import net.itsthesky.disky.core.Bot;

/**
 * Class that will store and handle information about a bot's application.
 */
public record BotApplication(String name, String clientID, String clientSecret) {

    public Bot getBot() {
        return DiSky.getManager().fromName(name());
    }
}