package com.malbano.universidade.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "funcionarios")
public class Funcionario {
    @Id
    @Column(name = "funcionario_id", nullable = false, length = 12)
    private String funcionarioId;

    @Column(name = "nome", length = 100)
    private String nome;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "funcao_id")
    private Funcao funcao;

}