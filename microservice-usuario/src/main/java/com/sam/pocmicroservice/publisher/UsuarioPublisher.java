package com.sam.pocmicroservice.publisher;

import com.sam.pocmicroservice.dto.NovoUsuarioRequest;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class UsuarioPublisher {

    private final RabbitTemplate rabbitTemplate;
    @Value("${broker.queue.name}")
    private String routingKey;
    public UsuarioPublisher(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }


    public void publicarMensagem(NovoUsuarioRequest request) {
        rabbitTemplate.convertAndSend(routingKey, request);
    }


}
