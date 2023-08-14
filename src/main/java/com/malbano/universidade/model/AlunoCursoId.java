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
public class AlunoCursoId implements Serializable {
    private static final long serialVersionUID = 8898345214350320752L;
    @Column(name = "aluno_id", nullable = false, length = 12)
    private String alunoId;

    @Column(name = "curso_id", nullable = false)
    private Integer cursoId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        AlunoCursoId entity = (AlunoCursoId) o;
        return Objects.equals(this.alunoId, entity.alunoId) &&
                Objects.equals(this.cursoId, entity.cursoId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(alunoId, cursoId);
    }

}