package com.malbano.universidade.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "funcoes")
public class Funcao {
    @Id
    @Column(name = "funcao_id", nullable = false)
    private Integer id;

    @Column(name = "nome", length = 50)
    private String nome;

}