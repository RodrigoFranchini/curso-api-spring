package com.curso.api.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity // Mapeamento da entidade
@Table(name = "curso") // Define nome da tabela como CURSO
public class Curso implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id // Declara atributo como chave primária
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Gera valor incremental ao Id
    private Integer id;

    @NotNull
    private String area;

    @Column(name = "data_de_criacao")
    @JsonFormat(pattern = "dd/MM/yyyy HH:mm")
    @CreationTimestamp
    private LocalDateTime dataDeCriacao;

    @Column(name = "data_de_atualizacao HH:mm")
    @JsonFormat(pattern = "dd/MM/yyyy")
    @UpdateTimestamp
    private LocalDateTime dataDeAtualizacao;

    @Column(name = "nome", nullable = false)
    // Define o nome da coluna como NOME, não aceita null como parametro
    private String nome;

    private String usuario;

    @Column(name = "valor_do_curso")
    @Transient // Define a váriavel como oculta no BD
    private BigDecimal valorDoCurso;

    @OneToMany(mappedBy = "curso")
    private List<Aluno> alunos;

    @PostPersist // Sempre que uma nova instancia de Curso for persistida no BD a função é chamada.
    private void aposPersistirDados() {
        System.out.println("Instância criada com sucesso!");
    }

    @PrePersist
    private void antesDePersistirDados() {
        this.usuario = "Admin";
    }

    public Curso() {
        alunos = new ArrayList<>();
    }

    public Curso(String nome, String area) {
        super();
        this.nome = nome;
        this.area = area;
        alunos = new ArrayList<>();
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

    public LocalDateTime getDataDeCriacao() {
        return dataDeCriacao;
    }

    public void setDataDeCriacao(LocalDateTime dataDeCriacao) {
        this.dataDeCriacao = dataDeCriacao;
    }

    public LocalDateTime getDataDeAtualizacao() {
        return dataDeAtualizacao;
    }

    public void setDataDeAtualizacao(LocalDateTime dataDeAtualizacao) {
        this.dataDeAtualizacao = dataDeAtualizacao;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public BigDecimal getValorDoCurso() {
        return valorDoCurso;
    }

    public void setValorDoCurso(BigDecimal valorDoCurso) {
        this.valorDoCurso = valorDoCurso;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "id=" + id +
                ", area='" + area + '\'' +
                ", nome='" + nome + '\'' +
                '}';
    }
}
