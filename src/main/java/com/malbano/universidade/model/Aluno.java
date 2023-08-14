package com.malbano.universidade.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "alunos")
public class Aluno {
    @Id
    @Column(name = "aluno_id", nullable = false, length = 12)
    private String alunoId;

    @Column(name = "nome_aluno", length = 100)
    private String nomeAluno;

    @Column(name = "data_nascimento")
    private LocalDate dataNascimento;

    @Column(name = "endereco", length = 200)
    private String endereco;

}