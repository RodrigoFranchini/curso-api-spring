package com.curso.api.controllers;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import com.curso.api.entities.Curso;
import com.curso.api.entities.dto.CursoDTO;
import com.curso.api.entities.mapper.CursoMapper;
import com.curso.api.services.CursoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/cursos")
public class CursoResource {

    @Autowired
    private CursoService cursoService;

    @Autowired
    private CursoMapper mapper;

    @GetMapping("/lista")
    public ResponseEntity<List<Curso>> getCursos() {
        List<Curso> cursos = cursoService.getCursos();
        return ResponseEntity.ok().body(cursos);
    }

    @PostMapping("/save")
    public ResponseEntity<Curso> saveCurso(@Valid @RequestBody CursoDTO cursoDTO) throws URISyntaxException {
        Curso novoCurso = cursoService.save(mapper.mapCursoDTOToCurso(cursoDTO));
        return ResponseEntity.created(new URI("/cursos/salva/" + novoCurso.getId())).body(novoCurso);
    }
}
