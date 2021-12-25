package com.ramesh.restservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {

    @GetMapping("outside")
    public String outside() {
        return "Outside Pageage";

    }
}
