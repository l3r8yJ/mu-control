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
@Table(name = "Incoming_Documents_Processing_History", schema = "public", catalog = "mu-control")
@Data
public class IncomingDocumentsProcessingHistoryEntity {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "incoming_document_id")
    private int incomingDocumentId;
    @Basic
    @Column(name = "status")
    private String status;
    @Basic
    @Column(name = "status_date")
    private Timestamp statusDate;

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        IncomingDocumentsProcessingHistoryEntity that =
            (IncomingDocumentsProcessingHistoryEntity) obj;
        return this.id == that.id
            && this.incomingDocumentId == that.incomingDocumentId
            && Objects.equals(this.status, that.status)
            && Objects.equals(this.statusDate, that.statusDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.incomingDocumentId, this.status, this.statusDate);
    }
}
