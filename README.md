# Curso API Java Spring Boot 

## Sobre 
Este projeto é uma API RESTful desenvolvida com Spring Boot, a API permite gerenciar cursos, sendo projetada para ser facilmente extensível com novas funcionalidades conforme o desenvolvimento progride. 

Este projeto está atualmente em desenvolvimento. Novas funcionalidades estão sendo planejadas e serão implementadas em futuras versões.

# Índice

1. [Controllers](src/main/java/com/curso/api/controllers)
2. [Entities](src/main/java/com/curso/api/entities)
3. [Repositories](src/main/java/com/curso/api/repositories)
4. [Services](src/main/java/com/curso/api/services)
5. [Resources](src/main/resources)
6. [CursoApiApplication.java](src/main/java/com/curso/api/CursoApiApplication.java)


## Estrutura do Projeto Spring Boot

### *Controllers*
Essa pasta contém os controladores da API. Os controladores são responsáveis por receber as requisições HTTP, processá-las e retornar a resposta adequada ao cliente.

### *Entities*
Contém as classes que representam as entidades do sistema.

### *Repositories*
Aqui ficam os repositórios, que são responsáveis pela comunicação direta com o banco de dados.

### *Services*
Contém as regras de negócio da aplicação. Os serviços processam os dados vindos dos repositórios e aplicam a lógica necessária antes de enviá-los aos controladores.

### *Resources*
Nesta pasta ficam os recursos adicionais como os arquivos de configuração (por exemplo, `application.properties`) e scripts SQL (`data.sql`) para inicialização do banco de dados.

### *CursoApiApplication.java*
Esta é a classe principal que inicializa a aplicação Spring Boot. Aqui está configurada a execução da API.


## Tecnologias
- **Java 17**: O projeto é construído utilizando o Java 17.
- **Spring Boot 3.3.4**: Proporciona a base para construir a API, incluindo injeção de dependências, validação e JPA.
- **Spring Data JPA**: Simplifica as interações com o banco de dados através de repositórios.
- **Banco de Dados H2**: Utilizado para desenvolvimento e testes como banco de dados em memória.
- **Maven**: Ferramenta de build e gerenciamento de dependências.g

## Como Executar

Para executar a aplicação siga os seguintes passos:

- Clonar o repositório e entrar no diretório:
````bash
git clone https://github.com/RodrigoFranchini/curso-api-spring.git

cd curso-api-spring
````
- Construa o projeto utilizando o [Maven](https://maven.apache.org/):
````bash
mvn clean install  
````
Executar a aplicação: Após a construção do projeto, execute-o com o seguinte comando do Maven:
````bash 
mvn spring-boot:run
````

- A API está rodando em http://localhost:8080.

## Endpoints da API
Cursos:
- **GET** /cursos/lista: Recupera todos os cursos.
- **POST** /cursos/save: Cria um novo curso.

Representa um curso com os seguintes atributos:

- nome: O nome do curso (Exemplo: "Economia").
- area: A área de estudo (Exemplo: "Exatas").

## Licença

Este projeto é licenciado sob a Licença MIT. Para obter uma cópia desta licença, consulte o arquivo [LICENSE](LICENSE) ou visite [esse link](https://opensource.org/license/mit).

