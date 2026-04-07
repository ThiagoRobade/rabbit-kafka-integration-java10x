package dev.java10x.email.configuration;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQ {

    private final String QUEUE_NAME = "emailQueue";

    public Queue queue() {
        return new Queue(QUEUE_NAME, true);
    }
}
