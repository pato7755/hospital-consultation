package com.consultation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication(scanBasePackages = "com")
public class MedpharmaApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(MedpharmaApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(MedpharmaApplication.class, args);
//        ViewConsultations viewConsultations = new ViewConsultations();
//        System.out.println("all: " + viewConsultations.allConsultations());

//        AddConsultation add = new AddConsultation();
//        System.out.println("add: " + add.addConsultation(new Consultation(2, "asdf", "wer", "eiei", "jdkd", "iiie")));
    }

}
