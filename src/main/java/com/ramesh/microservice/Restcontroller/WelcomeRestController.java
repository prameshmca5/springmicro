package com.ramesh.microservice.Restcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {
    @GetMapping("/aa")
    public String homePage() {
        return "HomePage";
    }
    @GetMapping("/bb")
    public String hiPage() {
        return "HiPage";
    }
}