package com.ms.email.dtos;

import jakarta.persistence.Column;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class EmailDto {
    @NotBlank
    private String ownerRef; //Referencia do propietario que esta mandando a msg
    @NotBlank
    @Email //verifica se há um email valido
    private String emailFrom;
    @NotBlank
    @Email
    private String emailTo;
    @NotBlank
    private String subject;// Titulo do email
    @NotBlank
    private String text;
}
