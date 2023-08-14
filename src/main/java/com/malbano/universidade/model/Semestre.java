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
@Table(name = "semestres")
public class Semestre {
    @Id
    @Column(name = "semestre_id", nullable = false)
    private Integer id;

    @Column(name = "ano")
    private Integer ano;

    @Column(name = "periodo", length = 10)
    private String periodo;

}