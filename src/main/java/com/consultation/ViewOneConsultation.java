package com.consultation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/consultation-by-id")
public class ViewOneConsultation {

    @Autowired
    ConsultationRepository consultationRepository;

    @GetMapping(path = "/get", produces = "application/json", consumes = "application/json")
    public ResponseClass oneConsultation(@RequestParam String id) {

        ResponseClass response;

        try {

            List<Consultation> consultation = consultationRepository.getOneById(Integer.parseInt(id));

            System.out.println("consultation: " + consultation);

            response = new ResponseClass("100", "Successful", consultation);

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
