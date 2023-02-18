package com.l3r8y.mucontrol.entity;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.sql.Timestamp;
import java.util.Objects;
import lombok.Data;

@Entity
@Table(name = "MUs", schema = "public", catalog = "mu-control")
@Data
public class MUsEntity {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;

    @Basic
    @Column(name = "incoming_doc_id")
    private int incomingDocId;

    @Basic
    @Column(name = "deadline")
    private Timestamp deadline;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MUsEntity mUsEntity = (MUsEntity) o;
        return this.id == mUsEntity.id
                   && this.incomingDocId == mUsEntity.incomingDocId
                   && Objects.equals(this.deadline, mUsEntity.deadline);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.incomingDocId, this.deadline);
    }
}
