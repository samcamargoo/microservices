package com.sam.microserviceemail.service;

import com.sam.microserviceemail.dto.NovoUsuarioRequest;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    private final JavaMailSender mailSender;
    @Value("${EMAIL_USER}")
    private String from;

    public EmailService(JavaMailSender mailSender) {
        this.mailSender = mailSender;
    }

    public void sendEmail(NovoUsuarioRequest request) {

        try {
            SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
            simpleMailMessage.setTo(request.email());
            simpleMailMessage.setSubject("Cadastro realizado com sucesso");
            simpleMailMessage.setFrom(from);
            simpleMailMessage.setText("Bem vindo " +  request.nome());
            mailSender.send(simpleMailMessage);
        } catch (MailException e) {
            System.out.println(e.getMessage());
        }

    }
}
