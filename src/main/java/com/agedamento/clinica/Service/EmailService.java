package com.agedamento.clinica.Service;

import jakarta.mail.MessagingException;

public interface EmailService {
    void enviarEmail(String destinatario, String assunto, String mensagem) throws MessagingException;
}
