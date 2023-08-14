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
public class CursoMateriaId implements Serializable {
    private static final long serialVersionUID = -1914777261196218389L;
    @Column(name = "curso_id", nullable = false)
    private Integer cursoId;

    @Column(name = "materia_id", nullable = false)
    private Integer materiaId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        CursoMateriaId entity = (CursoMateriaId) o;
        return Objects.equals(this.materiaId, entity.materiaId) &&
                Objects.equals(this.cursoId, entity.cursoId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(materiaId, cursoId);
    }

}