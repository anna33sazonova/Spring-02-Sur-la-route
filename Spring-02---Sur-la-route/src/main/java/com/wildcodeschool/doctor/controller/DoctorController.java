package com.wildcodeschool.doctor.controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.server.ResponseStatusException;

import com.wildcodeschool.doctor.model.Doctor;

@Controller
public class DoctorController {
    @GetMapping("/")
    public String getIndex() {
      return "index.html";
    }

    @GetMapping("/doctor/{number}")
    @ResponseBody
    public Doctor getDoctor(@PathVariable int number) {
    
        if(number >= 1 && number <= 12) {
            throw new ResponseStatusException(HttpStatus.SEE_OTHER, "303 See Other.");
        }
        if(number > 13) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Impossible de récupérer l'incarnation " +number);
        }
        if(number==13) {
              }
         return new Doctor(13, "Jodie Whittaker");

}

}