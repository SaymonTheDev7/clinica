package com.agedamento.clinica.Controller;

import com.agedamento.clinica.Service.EmailService;
import jakarta.mail.MessagingException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/email")
public class EmailController {

    private final EmailService emailService;

    public EmailController(EmailService emailService) {
        this.emailService = emailService;
    }

    @PostMapping("/enviar")
    public ResponseEntity<String> enviarEmail(@RequestParam String destinatario,
                                              @RequestParam String assunto,
                                              @RequestParam String mensagem) {
        try {
            emailService.enviarEmail(destinatario, assunto, mensagem);
            return ResponseEntity.ok("E-mail enviado com sucesso.");
        } catch (MessagingException e) {
            return ResponseEntity.status(500).body("Erro ao enviar e-mail: " + e.getMessage());
        }
    }
}
