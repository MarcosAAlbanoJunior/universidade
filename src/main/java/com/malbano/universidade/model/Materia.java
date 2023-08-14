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
@Table(name = "materias")
public class Materia {
    @Id
    @Column(name = "materia_id", nullable = false)
    private Integer id;

    @Column(name = "nome_materia", length = 100)
    private String nomeMateria;

}