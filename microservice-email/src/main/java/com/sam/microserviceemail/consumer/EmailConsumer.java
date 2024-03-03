package com.sam.microserviceemail.consumer;

import com.sam.microserviceemail.dto.NovoUsuarioRequest;
import com.sam.microserviceemail.service.EmailService;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class EmailConsumer {

    private final EmailService emailService;

    public EmailConsumer(EmailService emailService) {
        this.emailService = emailService;
    }

    @RabbitListener(queues = "${broker.queue.name}")
    public void listenEmailQueue(@Payload NovoUsuarioRequest request) {
        emailService.sendEmail(request);
    }
}
