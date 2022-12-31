package vernandodev.springbootrestapi.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/welcome")
public class WelcomeController {
    @GetMapping
    public String welcome() {
        return "Welcome To SpringBoot";
    }

    @PostMapping
    public String other() {
        return "Data Post";
    }
}
