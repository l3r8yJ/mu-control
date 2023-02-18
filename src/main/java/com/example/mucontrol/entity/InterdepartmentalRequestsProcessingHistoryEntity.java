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
@Table(name = "Interdepartmental_Requests_Processing_History", schema = "public", catalog = "mu-control")
@Data
public class InterdepartmentalRequestsProcessingHistoryEntity {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;

    @Basic
    @Column(name = "interdepartmental_request_id")
    private int interdepartmentalRequestId;

    @Basic
    @Column(name = "status")
    private String status;

    @Basic
    @Column(name = "status_date")
    private Timestamp statusDate;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        InterdepartmentalRequestsProcessingHistoryEntity that = (InterdepartmentalRequestsProcessingHistoryEntity) o;
        return this.id == that.id
            && this.interdepartmentalRequestId == that.interdepartmentalRequestId
            && Objects.equals(this.status, that.status)
            && Objects.equals(this.statusDate, that.statusDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            this.id,
            this.interdepartmentalRequestId,
            this.status,
            this.statusDate
        );
    }
}
