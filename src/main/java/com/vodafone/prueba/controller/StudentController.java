package com.vodafone.prueba.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @GetMapping("/student")
    private String getAllStudent() {
        return "EXAMPLE";
    }

}
