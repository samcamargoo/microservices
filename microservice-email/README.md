# Sobre este microservice

Microservice criado para envio de e-mail de usuários cadastrados.

## Rodando o projeto

Baixe e instale o [Maven.](https://maven.apache.org/download.cgi)

Crie suas credenciais para utilizar [AMPQ](https://customer.cloudamqp.com/signup)

Crie um database no MongoDB com nome microservice-emails

Crie sua credencias para envio de e-mail no [Gmail](https://www.youtube.com/redirect?event=video_description&redir_token=QUFFLUhqbnVUTFdqOXFHWDV3ZkwtZ2ZpdGlJb2hqUHMxZ3xBQ3Jtc0ttRXI3aWFEVXBWdVVKOEFRSzkwczhoR3FNY1Bla3BoR3BuOGcweXRRVGx6MWNrd3JjS0lWRFpUS0JEYVdIUGdGeUxCZm9FVWhibXI0dmxuOEVLSWoyM0xseWlsd0RUbVctRHdPZURUMjE3YlA2V1Jvaw&q=https%3A%2F%2Fsupport.google.com%2Faccounts%2Fanswer%2F185833&v=ZnECi2gatMs)

Insira as seguintes variáveis de ambiente.
```bash
${AMPQ_CREDENTIALS}
${EMAIL_USER} (E-mail que será utilizado para envio, exemplo: teste@gmail.com)
${EMAIL_PASSWORD} (Senha gerada ao criar suas credencias no Gmail para utilizar SMTP)
```

Entre na raiz do projeto e rode os seguintes comandos.
```bash
mvn clean install
mvn spring-boot:run
```
## License

[MIT](https://choosealicense.com/licenses/mit/)
