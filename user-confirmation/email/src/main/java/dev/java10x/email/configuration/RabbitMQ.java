package dev.java10x.email.configuration;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQ {

    private final String queueName = "emailQueue";

    @Bean
    public Queue queue() {
        return new Queue(queueName, true);
    }
}
