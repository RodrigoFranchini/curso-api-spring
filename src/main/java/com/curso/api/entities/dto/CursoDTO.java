package com.curso.api.entities.dto;

import jakarta.validation.constraints.NotBlank;

import java.io.Serializable;

public class CursoDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    @NotBlank(message = "Nome vazio, nulo ou em branco!")
    private String nome;

    @NotBlank(message = "Nome vazio, nulo ou em branco!")
    private String area;

    public CursoDTO() {
    }

    public CursoDTO(Integer id, String nome, String area) {
        super();
        this.id = id;
        this.nome = nome;
        this.area = area;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
}
