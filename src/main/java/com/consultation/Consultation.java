package com.consultation;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "tb_consultation")
public class Consultation {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "consultation_tb_sequence")
    private Integer id;

    private String patientName;

    private String symptoms;

    private String allergies;

    private String prescription;

    private String doctorName;

    public Consultation() {
    }

    public Consultation(Integer id, String patientName, String symptoms, String allergies, String prescription, String doctorName) {
        this.id = id;
        this.patientName = patientName;
        this.symptoms = symptoms;
        this.allergies = allergies;
        this.prescription = prescription;
        this.doctorName = doctorName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String brand) {
        this.patientName = brand;
    }

    public String getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(String size) {
        this.symptoms = size;
    }

    public String getPrescription() {
        return prescription;
    }

    public void setPrescription(String price) {
        this.prescription = price;
    }

    public String getAllergies() {
        return allergies;
    }

    public void setAllergies(String color) {
        this.allergies = color;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    @Override
    public String toString() {
        return "Consultation{" +
                "id=" + id +
                ", patientName='" + patientName + '\'' +
                ", symptoms='" + symptoms + '\'' +
                ", allergies='" + allergies + '\'' +
                ", prescription='" + prescription + '\'' +
                ", doctorName='" + doctorName + '\'' +
                '}';
    }
}
