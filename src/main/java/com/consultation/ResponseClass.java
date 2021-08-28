package com.consultation;

import java.util.List;

public class ResponseClass {

    private String responseCode;
    private String responseMessage;
    private List<Consultation> data;

    public ResponseClass(String responseCode, String responseMessage) {
        this.responseCode = responseCode;
        this.responseMessage = responseMessage;
    }

    public ResponseClass(String responseCode, String responseMessage, List<Consultation> data) {
        this.responseCode = responseCode;
        this.responseMessage = responseMessage;
        this.data = data;
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

    @Override
    public String toString() {
        return "ResponseClass{" +
                "responseCode='" + responseCode + '\'' +
                ", responseMessage='" + responseMessage + '\'' +
                ", consultations=" + data +
                '}';
    }
}
