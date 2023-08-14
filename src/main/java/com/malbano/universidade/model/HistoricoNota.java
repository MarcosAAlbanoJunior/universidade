package com.malbano.universidade.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "historiconotas")
public class HistoricoNota {
    @EmbeddedId
    private HistoricoNotaId id;

    @MapsId("alunoId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "aluno_id", nullable = false)
    private Aluno aluno;

    @MapsId("materiaId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "materia_id", nullable = false)
    private Materia materia;

    @MapsId("semestreId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "semestre_id", nullable = false)
    private Semestre semestre;

    @Column(name = "nota")
    private Float nota;

}