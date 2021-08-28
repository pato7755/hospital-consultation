package com.consultation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/consultation")
public class AddConsultation {

    @Autowired
    ConsultationRepository consultationRepository;

    @Autowired
    UserRepository userRepository;

    @PostMapping(path = "/add", produces = "application/json", consumes = "application/json")
    public ResponseClass addConsultation(@RequestParam String userId, @RequestBody Consultation consultation) {

        System.out.println("userId: " + userId);
        System.out.println("consultation: " + consultation);

        ResponseClass response;

        try {

            if (userId != null && !userId.isEmpty()) {

                User userDetails = userRepository.findByUserId(userId);

                System.out.println("userDetails: " + userDetails.toString());

                if (userDetails.getRole().equals("ADMIN")) {

                    consultationRepository.save(consultation);

                    response = new ResponseClass("100", "Consultation record added successfully");

                } else {

                    response = new ResponseClass("103", "Sorry, you are not authorized to perform this action");

                }

            } else {
                response = new ResponseClass("103", "Sorry, you are not authorized to perform this action");
            }

            return response;

        } catch (Exception ex) {

            ex.printStackTrace();
            System.out.println("Add consultation exception: " + ex.getMessage());

            response = new ResponseClass("101", "An error occurred when adding consultation");

            System.out.println("response: " + response.toString());

            return response;

        }

    }

}
