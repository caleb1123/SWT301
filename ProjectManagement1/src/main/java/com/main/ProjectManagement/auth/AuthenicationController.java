package com.main.ProjectManagement.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/auth")
public class AuthenicationController {
    @PostMapping("/register")
    public ResponseEntity<AuthenticationResponse> regiter(
            @RequestBody RegisterRequest request
    ){
//
    }
    @PostMapping("/authenticate")
    public ResponseEntity<AuthenticationResponse> regiter(
            @RequestBody AuthenticationRequest request
    ){
//
    }
}
