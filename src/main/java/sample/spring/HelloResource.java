package sample.spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloResource {

    @Value("${config.val}")
    private String configValue;

    @GetMapping("/hello")
    public String hello() {
        return configValue;
    }
}
