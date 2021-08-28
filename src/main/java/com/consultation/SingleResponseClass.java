package com.consultation;

import java.util.List;

public class SingleResponseClass {

    private String responseCode;
    private String responseMessage;
    private List<Consultation> data;
    private String singleRecord;

    public SingleResponseClass(String responseCode, String responseMessage) {
        this.responseCode = responseCode;
        this.responseMessage = responseMessage;
    }

    public SingleResponseClass(String responseCode, String responseMessage, List<Consultation> data) {
        this.responseCode = responseCode;
        this.responseMessage = responseMessage;
        this.data = data;
    }

    public SingleResponseClass(String responseCode, String responseMessage, String singleRecord) {
        this.responseCode = responseCode;
        this.responseMessage = responseMessage;
        this.singleRecord = singleRecord;
    }

    public String getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }

    public String getResponseMessage() {
        return responseMessage;
    }

    public void setResponseMessage(String responseMessage) {
        this.responseMessage = responseMessage;
    }

    public List<Consultation> getData() {
        return data;
    }

    public void setData(List<Consultation> data) {
        this.data = data;
    }

    public String getSingleRecord() {
        return singleRecord;
    }

    public void setSingleRecord(String singleRecord) {
        this.singleRecord = singleRecord;
    }

    @Override
    public String toString() {
        return "ResponseClass{" +
                "responseCode='" + responseCode + '\'' +
                ", responseMessage='" + responseMessage + '\'' +
                ", consultations=" + data +
                '}';
    }
}
