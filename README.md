# Curso API Java Spring Boot 

## Sobre 
Este projeto é uma API RESTful desenvolvida com Spring Boot, a API permite gerenciar cursos, sendo projetada para ser facilmente extensível com novas funcionalidades conforme o desenvolvimento progride. 

Este projeto está atualmente em desenvolvimento. Novas funcionalidades estão sendo planejadas e serão implementadas em futuras versões.


## Tecnologias
- **Java 17**: O projeto é construído utilizando o Java 17.
- **Spring Boot 3.3.4**: Proporciona a base para construir a API, incluindo injeção de dependências, validação e JPA.
- **Spring Data JPA**: Simplifica as interações com o banco de dados através de repositórios.
- **Banco de Dados H2**: Utilizado para desenvolvimento e testes como banco de dados em memória.
- **Maven**: Ferramenta de build e gerenciamento de dependências.g

# Como Executar

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

