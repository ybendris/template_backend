package com.template.backend.auth.controllers;

import com.template.backend.auth.dtos.AuthenticationRequest;
import com.template.backend.auth.dtos.AuthenticationResponse;
import com.template.backend.auth.dtos.RegisterRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/api/v1/auth")
public interface AuthenticationController {

    @PostMapping("/register")
    ResponseEntity<AuthenticationResponse> register(
            @RequestBody RegisterRequest request
    );

    @PostMapping("/authenticate")
    ResponseEntity<AuthenticationResponse> authenticate(
            @RequestBody AuthenticationRequest request
    );


}
