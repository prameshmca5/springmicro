package Restcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class WelcomeRestController {

    @GetMapping("/")
    public String hello() {
        return "Welcome Rest Controller";
    }

}
