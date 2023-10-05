package ru.porabote.springbootrestauth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.security.RolesAllowed;

@RestController
@SpringBootApplication
public class SpringBootRestAuthApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootRestAuthApplication.class, args);
    }

    @GetMapping("/hi")
    @Secured({"ROLE_ADMIN"})
    public String hi() {
        return "Hi";
    }

    @GetMapping("/bye")
    @Secured({"READ"})
    public String bye() {
        return "bye";
    }

    @GetMapping("/write")
    @RolesAllowed({"WRITE"})
    public String write() {
        return "write";
    }

    @GetMapping("/update")
    @PreAuthorize("hasAuthority('WRITE') or hasAuthority('DELETE')")
    public String update() {
        return "update";
    }

    @GetMapping("/profile")
    @PreAuthorize("#username == authentication.principal.username")
    public String profile(String username) {
        return "It profile " + username;
    }

}
