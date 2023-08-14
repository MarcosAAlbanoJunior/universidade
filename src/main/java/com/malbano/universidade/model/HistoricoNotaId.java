package com.malbano.universidade.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
@Embeddable
public class HistoricoNotaId implements Serializable {
    private static final long serialVersionUID = 6817481241293654998L;
    @Column(name = "aluno_id", nullable = false, length = 12)
    private String alunoId;

    @Column(name = "materia_id", nullable = false)
    private Integer materiaId;

    @Column(name = "semestre_id", nullable = false)
    private Integer semestreId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        HistoricoNotaId entity = (HistoricoNotaId) o;
        return Objects.equals(this.semestreId, entity.semestreId) &&
                Objects.equals(this.materiaId, entity.materiaId) &&
                Objects.equals(this.alunoId, entity.alunoId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(semestreId, materiaId, alunoId);
    }

}