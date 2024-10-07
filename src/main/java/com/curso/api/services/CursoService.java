package com.curso.api.services;

import java.util.List;
import com.curso.api.entities.Curso;

public interface CursoService {
    List<Curso> getCursos();

    Curso save(Curso curso);
}
