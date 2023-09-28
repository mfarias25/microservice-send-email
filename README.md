<h1 align="center">
  MENSAGERIA COM RABBITMQ NO MICROSERVICE DE EMAIL
</h1>

<p align="center">
 <img src="https://img.shields.io/static/v1?label=Tipo&message=Desafio&color=8257E5&labelColor=000000" alt="Desafio" />
</p>


## Tecnologias

- [Spring Boot](https://spring.io/projects/spring-boot)
- [Spring MVC](https://docs.spring.io/spring-framework/reference/web/webmvc.html)
- [Spring Data JPA](https://spring.io/projects/spring-data-jpa)
- [Smtp do gmail](https://www.youtube.com/redirect?event=video_description&redir_token=QUFFLUhqbFNnT1Y1TG1PTDBfZ2Y4TS1GZW90UEhodHhiUXxBQ3Jtc0tsZ2ltUEtOT2xSdVN4MjJHNU16YjlVbEpYekZVNFFkMTVtYk5UbjcxNlZvOG1NTWpfaEtpRzV1MWtwcklUMVFXdDdtS2hRNngzbTNUdmNUR3VTRUd6SEphMkk1RFdSSVptX2RUekJGWC00aUxzOUptQQ&q=https%3A%2F%2Fsupport.google.com%2Faccounts%2Fanswer%2F185833&v=ZBleZzJf6ro)
- [PostgreSQL](https://mvnrepository.com/artifact/org.postgresql/postgresql/42.6.0)
- [Spring Boot Starter AMQP](https://www.cloudamqp.com/)
- [Plataforma CloudAMQP](https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-amqp)



## Práticas adotadas

- SOLID, DRY, YAGNI, KISS
- API REST
- Consultas com Spring Data JPA
- Injeção de Dependências
- Tratamento de respostas de erro
- Microservice para envio de email com Spring Boot e Spring Mail
- Serviço de email trabalhando de forma independente e autônoma
- Mensageria utilizando Spring AMQP e o RabbitMQ


## API Endpoints

Para fazer as requisições HTTP abaixo, foi utilizada a ferramenta [postman](https://www.postman.com/downloads/):

- Envio/Criação de Email
```
localhost:8080/sending-email

[
  {
    "ownerRef": "Mateus - Testemail-02",
    "emailFrom": "mateus.fariasgg@gmail.com",
    "emailTo": "mateus.fariasall@gmail.com",
    "subject": "Test-Send-email-02",
    "text": "Olá, este é um teste de email-02"
}
]
```
## Test Envio de Email por Mensageria



## Cloudamqp Instances RabbitMQ