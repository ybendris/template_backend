package com.template.backend.auth.services;

import com.template.backend.auth.dtos.AuthenticationRequest;
import com.template.backend.auth.dtos.AuthenticationResponse;
import com.template.backend.auth.dtos.RegisterRequest;

public interface AuthenticationService {
    AuthenticationResponse register(RegisterRequest request);

    AuthenticationResponse authenticate(AuthenticationRequest request);
}
