package me.itswagpvp.waglib.redis;

import me.itswagpvp.waglib.redis.models.MessageTransferObject;

import java.util.logging.Logger;

/**
 * @author _ItsWagPvP
 * @since 1.0.0
 */
@SuppressWarnings("unused")
public interface RedisPlugin {

    /**
     * Calls the corresponding events when message was received
     *
     * @param channel               Channel which received the message
     * @param messageTransferObject {@link MessageTransferObject} which was received
     */
    void onMessageReceived(String channel, MessageTransferObject messageTransferObject);

    /**
     * Returns logger object
     *
     * @return Logger instance of the current implementation
     */
    Logger logger();

}
