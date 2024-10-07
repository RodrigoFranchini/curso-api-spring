package com.curso.api.services.impl;

import com.curso.api.repositories.CursoRepository;
import com.curso.api.entities.Curso;
import com.curso.api.services.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service // Indica que a classe faz parte da camada de serviços
public class CursoServiceImpl implements CursoService {

    @Autowired
    private CursoRepository cursoRepository;

    @Override
    public List<Curso> getCursos() {
        return cursoRepository.findAll();
    }

    public Curso save(Curso curso) {
        return cursoRepository.save(curso);
    }
}
