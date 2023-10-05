package ru.porabote.springbootrestauth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringBootRestAuthApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootRestAuthApplication.class, args);
    }

    @GetMapping("/hi")
    public String hi() {
        return "Hi";
    }

    @GetMapping("/bye")
    public String bye() {
        return "bye";
    }

    @GetMapping("/write")
    public String write() {
        return "write";
    }

}
