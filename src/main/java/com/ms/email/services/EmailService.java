package com.ms.email.services;

import com.ms.email.enums.StatusEmail;
import com.ms.email.models.EmailModel;
import com.ms.email.repositories.EmailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class EmailService {

    @Autowired //Injeção do Repository
    EmailRepository emailRepository;

    @Autowired
    private JavaMailSender emailSender;

    public EmailModel sendEmail(EmailModel emailModel) {   //SMTP GMAIL
      emailModel.setSendEmail(LocalDateTime.now());
      try{
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom(emailModel.getEmailFrom());
        message.setTo(emailModel.getEmailTo());
        message.setSubject(emailModel.getSubject());
        message.setText(emailModel.getText());
        emailSender.send(message);

        emailModel.setStatusEmail(StatusEmail.SENT);
      }catch(MailException exception) {
          emailModel.setStatusEmail(StatusEmail.ERROR);
      }finally { //Salva o email com seu determinado status (OK or ERROR)
          return emailRepository.save(emailModel);
      }
    }
}
