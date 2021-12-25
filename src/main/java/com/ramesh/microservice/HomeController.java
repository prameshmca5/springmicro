package com.ramesh.microservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/")
    public String homePage() {
        return "HomePage";
    }
    @GetMapping("/hi")
    public String hiPage() {
        return "HiPage";
    }
}
