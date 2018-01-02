package org.mqttbee.mqtt5.codec.encoder;

import io.netty.buffer.ByteBuf;
import io.netty.channel.Channel;
import org.mqttbee.annotations.NotNull;
import org.mqttbee.mqtt5.message.subscribe.Mqtt5SubscribeInternal;

import javax.inject.Singleton;

/**
 * @author Silvio Giebl
 */
@Singleton
public class Mqtt5SubscribeEncoder implements Mqtt5MessageEncoder<Mqtt5SubscribeInternal> {

    public void encode(
            @NotNull final Mqtt5SubscribeInternal subscribe, @NotNull final Channel channel, @NotNull final ByteBuf out) {

    }

}