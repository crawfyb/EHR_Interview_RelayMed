package com.EHR.EHR.Models;

import java.util.ArrayList;
import java.util.List;

public class Patient {

    private Long id;

    private String mRN;

    private String firstName;

    private String lastName;

    private String dateOfBirth;

    private String address;

    private List<PatientOrder> patientOrders;

    public Patient(String mRN, String firstName, String lastName, String dateOfBirth, String address) {
        this.mRN = mRN;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.patientOrders = new ArrayList<>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getmRN() {
        return mRN;
    }

    public void setmRN(String mRN) {
        this.mRN = mRN;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<PatientOrder> getPatientOrders() {
        return patientOrders;
    }

    public void setPatientOrders(List<PatientOrder> patientOrders) {
        this.patientOrders = patientOrders;
    }
}
