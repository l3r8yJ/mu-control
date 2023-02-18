package com.example.mucontrol.entity;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Objects;
import lombok.Data;

@Entity
@Table(name = "Incoming_Documents", schema = "public", catalog = "mu-control")
@Data
public class IncomingDocumentsEntity {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;

    @Basic
    @Column(name = "document_number")
    private String documentNumber;

    @Basic
    @Column(name = "document_date")
    private Timestamp documentDate;

    @Basic
    @Column(name = "sender")
    private String sender;

    @Basic
    @Column(name = "recipient")
    private String recipient;

    @Basic
    @Column(name = "title")
    private String title;

    @Basic
    @Column(name = "description")
    private String description;

    @Basic
    @Column(name = "es_signature")
    private byte[] esSignature;

    @Basic
    @Column(name = "processing_status")
    private String processingStatus;

    @Override
    public final boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }
        final IncomingDocumentsEntity that = (IncomingDocumentsEntity) obj;
        return this.id == that.id
            && Objects.equals(this.documentNumber, that.documentNumber)
            && Objects.equals(this.documentDate, that.documentDate)
            && Objects.equals(this.sender, that.sender)
            && Objects.equals(this.recipient, that.recipient)
            && Objects.equals(this.title, that.title)
            && Objects.equals(this.description, that.description)
            && Arrays.equals(this.esSignature, that.esSignature)
            && Objects.equals(this.processingStatus, that.processingStatus);
    }

    @Override
    public final int hashCode() {
        int result = Objects.hash(
            this.id,
            this.documentNumber,
            this.documentDate,
            this.sender,
            this.recipient,
            this.title,
            this.description, this.processingStatus
        );
        result = 31 * result + Arrays.hashCode(this.esSignature);
        return result;
    }
}
