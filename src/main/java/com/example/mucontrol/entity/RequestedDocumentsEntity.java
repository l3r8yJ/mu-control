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

@Entity
@Table(name = "Requested_Documents", schema = "public", catalog = "mu-control")
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getInterdepartmentalRequestId() {
        return interdepartmentalRequestId;
    }

    public void setInterdepartmentalRequestId(int interdepartmentalRequestId) {
        this.interdepartmentalRequestId = interdepartmentalRequestId;
    }

    public String getRequest() {
        return request;
    }

    public void setRequest(String request) {
        this.request = request;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public Timestamp getResponseDate() {
        return responseDate;
    }

    public void setResponseDate(Timestamp responseDate) {
        this.responseDate = responseDate;
    }

    public byte[] getEsSignature() {
        return esSignature;
    }

    public void setEsSignature(byte[] esSignature) {
        this.esSignature = esSignature;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RequestedDocumentsEntity that = (RequestedDocumentsEntity) o;
        return id == that.id && interdepartmentalRequestId == that.interdepartmentalRequestId
                   && Objects.equals(request, that.request) && Objects.equals(
            response, that.response) && Objects.equals(responseDate, that.responseDate)
                   && Arrays.equals(esSignature, that.esSignature);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(id, interdepartmentalRequestId, request, response, responseDate);
        result = 31 * result + Arrays.hashCode(esSignature);
        return result;
    }
}
