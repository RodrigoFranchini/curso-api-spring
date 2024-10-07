package com.curso.api;

import com.curso.api.entities.Curso;
import com.curso.api.repositories.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CursoApiApplication implements CommandLineRunner {

    @Autowired
    private CursoRepository cursoRepository;

    public CursoApiApplication(CursoRepository cursoRepository) {
        this.cursoRepository = cursoRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(CursoApiApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        //TODO: A implementação central ainda será desenvolvida.

        //  Está aplicação Spring Boot oferece as seguintes funcionalidades no momento:
        //  1. Leitura de dados: Os dados iniciais são puxados do arquivo 'data.sql' localizado em main/resources. Esses dados são carregados automaticamente para o banco de dados quando a aplicação é iniciada.
        //  2. Endpoints disponíveis:
        // - GET: /cursos/lista: Retorna uma lista de todos os cursos cadastrados no banco de dados.
        // - POST: /cursos/save: Permite cadastrar um novo curso no banco de dados. O corpo da requisição deve conte os dados do curso em formato JSON.
    }
}


