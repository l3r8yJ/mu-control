package com.l3r8y.mucontrol.entity;

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
@Table(name = "Requested_Documents", schema = "public", catalog = "mu-control")
@Data
public class RequestedDocumentsEntity {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;

    @Basic
    @Column(name = "interdepartmental_request_id")
    private int interdepartmentalRequestId;

    @Basic
    @Column(name = "request")
    private String request;

    @Basic
    @Column(name = "response")
    private String response;

    @Basic
    @Column(name = "response_date")
    private Timestamp responseDate;

    @Basic
    @Column(name = "es_signature")
    private byte[] esSignature;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RequestedDocumentsEntity that = (RequestedDocumentsEntity) o;
        return this.id == that.id
            && this.interdepartmentalRequestId == that.interdepartmentalRequestId
            && Objects.equals(this.request, that.request)
            && Objects.equals(this.response, that.response)
            && Objects.equals(this.responseDate, that.responseDate)
            && Arrays.equals(this.esSignature, that.esSignature);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(
            this.id,
            this.interdepartmentalRequestId,
            this.request,
            this.response,
            this.responseDate
        );
        result = 31 * result + Arrays.hashCode(this.esSignature);
        return result;
    }
}
