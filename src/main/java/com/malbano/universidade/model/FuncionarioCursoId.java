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
public class FuncionarioCursoId implements Serializable {
    private static final long serialVersionUID = -2737016390762128887L;
    @Column(name = "funcionario_id", nullable = false, length = 12)
    private String funcionarioId;

    @Column(name = "curso_id", nullable = false)
    private Integer cursoId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        FuncionarioCursoId entity = (FuncionarioCursoId) o;
        return Objects.equals(this.funcionarioId, entity.funcionarioId) &&
                Objects.equals(this.cursoId, entity.cursoId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(funcionarioId, cursoId);
    }

}