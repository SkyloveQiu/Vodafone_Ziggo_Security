package nl.vodafoneziggo.vodafoneziggo_security.controller;

import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import javax.ws.rs.BadRequestException;

@RestController
@EnableWebSecurity
public class EchoController {
    @GetMapping("/hello")
    public String home(String input) {
        return input;
    }

    @GetMapping("/test")
    public String test(String input) {
        return input;
    }

}
