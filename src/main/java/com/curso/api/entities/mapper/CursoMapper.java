package com.curso.api.entities.mapper;

import com.curso.api.entities.Curso;
import com.curso.api.entities.dto.CursoDTO;
import org.springframework.stereotype.Component;

@Component // Marca esta classe como um componente gerenciado pelo Spring, permitindo que ela seja injetada em outros beans com @Autowired
public class CursoMapper {
    public Curso mapCursoDTOToCurso(CursoDTO dto) {
        Curso curso = new Curso(dto.getNome(), dto.getArea());
        return curso;
    }
}
