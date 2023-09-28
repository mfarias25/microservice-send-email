package com.ms.email.models;

import com.ms.email.enums.StatusEmail;
import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

@Data // Lombok para nao precisar passar os getters, setter e contrutores.
@Entity
@Table(name = " TB_EMAIL")
public class EmailModel implements Serializable {
    private static final long serialVersionUID = 1L;


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID emailId;
    private String ownerRef; //Referencia do propietario que esta mandando a msg.
    private String emailFrom;
    private String emailTo;
    private String subject;// Titulo do email
    @Column(columnDefinition = "TEXT") // Corpo do email texto. +255 caracteres
    private String text;
    private LocalDateTime sendEmail;
    private StatusEmail statusEmail; //status send or error


}
