package com.outdd.controller;

import org.springframework.security.access.annotation.Secured;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author vaie
 * @Created 2019/1/28 15:20
 */
@RestController
public class ClientController {
    @GetMapping("/user")
    @Secured("ROLE_USER")
    public Authentication getUser() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        return authentication;
    }

    @GetMapping("/index")
    public String index() {
        return "index";
    }
}
