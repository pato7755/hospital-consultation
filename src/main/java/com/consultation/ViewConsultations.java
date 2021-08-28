package com.consultation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/consultations")
public class ViewConsultations {

    @Autowired
    ConsultationRepository consultationRepository;

    @GetMapping(path = "/get", produces = "application/json", consumes = "application/json")
    public ResponseClass allConsultations() {

        ResponseClass response;

        try {

            List<Consultation> consultationList = consultationRepository.findAll();

            System.out.println("consultationList: " + consultationList);

            response = new ResponseClass("100", "Successful", consultationList);

            return response;

        } catch (Exception ex) {

            ex.printStackTrace();
            System.out.println("View consultations exception: " + ex.getMessage());

            response = new ResponseClass("101", "An error occurred while fetching consultations");

            System.out.println("response: " + response.toString());

            return response;

        }
    }

}
