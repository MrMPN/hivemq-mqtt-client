/*
 * Copyright 2018 dc-square and the HiveMQ MQTT Client Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package com.hivemq.client.internal.mqtt.message.publish;

import com.hivemq.client.internal.mqtt.message.MqttProperty;

/**
 * All possible MQTT Will Publish properties and its byte code according to the MQTT 5 specification.
 *
 * @author Silvio Giebl
 */
public final class MqttWillPublishProperty {

    public static final int PAYLOAD_FORMAT_INDICATOR = MqttProperty.PAYLOAD_FORMAT_INDICATOR;
    public static final int MESSAGE_EXPIRY_INTERVAL = MqttProperty.MESSAGE_EXPIRY_INTERVAL;
    public static final int CORRELATION_DATA = MqttProperty.CORRELATION_DATA;
    public static final int CONTENT_TYPE = MqttProperty.CONTENT_TYPE;
    public static final int RESPONSE_TOPIC = MqttProperty.RESPONSE_TOPIC;
    public static final int WILL_DELAY_INTERVAL = MqttProperty.WILL_DELAY_INTERVAL;
    public static final int USER_PROPERTY = MqttProperty.USER_PROPERTY;

    private MqttWillPublishProperty() {}
}
