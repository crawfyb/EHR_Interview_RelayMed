package com.EHR.EHR.Models;

import java.util.ArrayList;
import java.util.List;

public class PatientOrder {

    private Long id;

    private String creationDate;

    private String status;

    private List<Patient> patients;

    private List<OrderType> orderCode;

    public PatientOrder(String creationDate, String status) {
        this.creationDate = creationDate;
        this.status = status;
        this.patients = new ArrayList<>();
        this.orderCode = new ArrayList<>();
    }

    public PatientOrder() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Patient> getPatients() {
        return patients;
    }

    public void setPatients(List<Patient> patients) {
        this.patients = patients;
    }

    public List<OrderType> getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(List<OrderType> orderCode) {
        this.orderCode = orderCode;
    }
}
