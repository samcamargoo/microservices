# Sobre este microservice

Microservice criado para cadastro simples de usuario.

## Rodando o projeto

Baixe e instale o [Maven.](https://maven.apache.org/download.cgi)

Crie um database no MongoDB com nome microservice-usuarios

Crie suas credenciais para utilizar [AMPQ](https://customer.cloudamqp.com/signup)


Insira as seguintes variáveis de ambiente.
```bash
${AMPQ_CREDENTIALS}
```

Entre na raiz do projeto e rode os seguintes comandos.
```bash
mvn clean install
mvn spring-boot:run
```
## License

[MIT](https://choosealicense.com/licenses/mit/)
