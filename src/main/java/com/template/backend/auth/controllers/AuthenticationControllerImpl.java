package com.template.backend.auth.controllers;

import com.template.backend.auth.dtos.AuthenticationRequest;
import com.template.backend.auth.dtos.AuthenticationResponse;
import com.template.backend.auth.services.AuthenticationService;
import com.template.backend.auth.dtos.RegisterRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class AuthenticationControllerImpl implements AuthenticationController{
    private final AuthenticationService service;

    @Override
    public ResponseEntity<AuthenticationResponse> register(RegisterRequest request) {
        return ResponseEntity.ok(service.register(request));
    }

    @Override
    public ResponseEntity<AuthenticationResponse> authenticate(AuthenticationRequest request) {
        return ResponseEntity.ok(service.authenticate(request));
    }
}
