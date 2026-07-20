package com.cognizant.springlearn.controller;

import com.cognizant.springlearn.util.JwtUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class AuthenticationController {

    private static final Logger logger = LoggerFactory.getLogger(AuthenticationController.class);

    @Autowired
    private JwtUtil jwtUtil;

    @GetMapping("/authenticate")
    public Map<String, String> authenticate(Authentication authentication) {
        logger.info("Start: authenticate() method invoked.");
        String username = authentication.getName();
        String token = jwtUtil.generateToken(username);
        logger.info("End: authenticate() method completed, token generated for user: {}", username);
        return Map.of("token", token);
    }
}