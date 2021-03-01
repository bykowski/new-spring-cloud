package pl.bykowski.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloApi {

    @Value("${eureka.instance.instance-id}")
    private String instanceName;

    @Value("${app.user}")
    private String appUser;

    @GetMapping("/hello")
    public String get() {
        return "Hello " + appUser + "! Instance: " + instanceName;
    }
}
