package me.itswagpvp.waglib.redis.events.bungee;

import me.itswagpvp.waglib.redis.models.MessageTransferObject;
import net.md_5.bungee.api.plugin.Event;

/**
 * @author _ItsWagPvP
 * @since 1.0.0
 * BungeeCord Event class used when message was received from subscribed channel.
 */
@SuppressWarnings("unused")
public class RedisMessageReceivedEvent extends Event implements me.itswagpvp.waglib.redis.events.RedisMessageReceivedEvent {

    /**
     * Name of the channel the message came from
     */
    private final String channel;

    /**
     * MessageTransferObject containing message's data
     */
    private final MessageTransferObject messageTransferObject;

    /**
     * Constructs the instance of the Event
     *
     * @param channel               Channel in which was the message published
     * @param messageTransferObject {@link MessageTransferObject} object containing data about published message
     */
    public RedisMessageReceivedEvent(String channel, MessageTransferObject messageTransferObject) {
        this.channel = channel;
        this.messageTransferObject = messageTransferObject;
    }

    @Override
    public String getSenderIdentifier() {
        return this.messageTransferObject.getSenderIdentifier();
    }

    @Override
    public String getChannel() {
        return this.channel;
    }

    @Override
    public String getMessage() {
        return this.messageTransferObject.getMessage();
    }

    @Override
    public <T> T getMessageObject(Class<T> objectClass) {
        return this.messageTransferObject.parseMessageObject(objectClass);
    }

    @Override
    public long getTimeStamp() {
        return this.messageTransferObject.getTimestamp();
    }

}
