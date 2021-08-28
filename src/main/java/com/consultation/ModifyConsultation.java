package com.consultation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/consultation")
public class ModifyConsultation {

    @Autowired
    ConsultationRepository consultationRepository;

    @Autowired
    UserRepository userRepository;

    @PutMapping(path = "/modify", produces = "application/json", consumes = "application/json")
    public ResponseClass modifyConsultation(@RequestParam String userId, @RequestBody Consultation consultation) {

        ResponseClass response;

        System.out.println("userId: " + userId);
        System.out.println("consultation: " + consultation);

        try {

            if (userId != null && !userId.isEmpty()) {

                User userDetails = userRepository.findByUserId(userId);

                System.out.println("userDetails: " + userDetails.toString());

                if (userDetails.getRole().equals("ADMIN")) {

                    Consultation consultationResult = consultationRepository.getOne((consultation.getId()));

                    consultationResult.setPatientName(consultation.getPatientName());
                    consultationResult.setAllergies(consultation.getAllergies());
                    consultationResult.setPrescription(consultation.getPrescription());
                    consultationResult.setSymptoms(consultation.getSymptoms());
                    consultationResult.setDoctorName(consultation.getDoctorName());

                    consultationRepository.save(consultationResult);

                    response = new ResponseClass("100", "Consultation details modified successfully");

                } else {

                    response = new ResponseClass("103", "Sorry, you are not authorized to perform this action");

                }

            } else {
                response = new ResponseClass("103", "Sorry, you are not authorized to perform this action");
            }

            return response;

        } catch (Exception ex) {

            ex.printStackTrace();
            System.out.println("Modify consultation details exception: " + ex.getMessage());

            response = new ResponseClass("103", "An error occurred");

            System.out.println("response: " + response.toString());

            return response;

        }
    }

}
