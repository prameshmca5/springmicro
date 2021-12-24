package CoreJavaTest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/welcome")
public class HelloController {

    @GetMapping("/")
    public String getCurrentString() {
        return "Welcome My Spring Boot Applications";
    }

}

