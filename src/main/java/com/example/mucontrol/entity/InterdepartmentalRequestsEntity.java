package com.example.mucontrol.entity;

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
@Table(name = "Interdepartmental_Requests", schema = "public", catalog = "mu-control")
@Data
public class InterdepartmentalRequestsEntity {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;

    @Basic
    @Column(name = "mu_id")
    private int muId;

    @Basic
    @Column(name = "request_type")
    private String requestType;

    @Basic
    @Column(name = "name")
    private String name;

    @Basic
    @Column(name = "created_at")
    private Timestamp createdAt;

    @Basic
    @Column(name = "responsible_person")
    private String responsiblePerson;

    @Basic
    @Column(name = "status")
    private String status;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        InterdepartmentalRequestsEntity that = (InterdepartmentalRequestsEntity) o;
        return this.id == that.id
            && this.muId == that.muId
            && Objects.equals(this.requestType, that.requestType)
            && Objects.equals(this.name, that.name)
            && Objects.equals(this.createdAt, that.createdAt)
            && Objects.equals(this.responsiblePerson, that.responsiblePerson)
            && Objects.equals(this.status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            this.id,
            this.muId,
            this.requestType,
            this.name,
            this.createdAt,
            this.responsiblePerson,
            this.status
        );
    }
}
