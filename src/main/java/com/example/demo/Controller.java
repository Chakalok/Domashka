package com.example.demo;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.security.RolesAllowed;

@RestController
public class Controller {

    @GetMapping("public/api")
    public String publicApi() {
        return "Public API, no token required";
    }

    @RolesAllowed("ADMIN")
    @GetMapping("admin/api")
    public String adminApi(Authentication authentication) {
        return "Only specified group of users allowed to be there! Your name is " + authentication.getName() + " role: ADMIN";
    }


    @RolesAllowed("SUPPORT")
    @GetMapping("support/api")
    public String supportApi(Authentication authentication) {
        return "Only specified group of users allowed to be there! Your name is " + authentication.getName() + " role: SUPPORT";
    }
}