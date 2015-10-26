package org.ddss.jms;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Service;

/**
 * Created by diogosantos on 24/10/15.
 */

@Service
public class JmsMessageSender {

    @JmsListener(destination="receiveMessages")
    @SendTo("sendMessage")
    public String processMessage(String text) {
        return "ACK message received " + text;
    }
}