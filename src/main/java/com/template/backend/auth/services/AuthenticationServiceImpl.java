package com.template.backend.auth.services;

import com.template.backend.auth.dtos.AuthenticationRequest;
import com.template.backend.auth.dtos.AuthenticationResponse;
import com.template.backend.auth.dtos.RegisterRequest;
import com.template.backend.config.JwtService;
import com.template.backend.user.Role;
import com.template.backend.user.RoleRepository;
import com.template.backend.user.User;
import com.template.backend.user.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class AuthenticationServiceImpl implements AuthenticationService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final JwtService jwtService;
    private final AuthenticationManager authenticationManager;
    private final RoleRepository roleRepository;

    @Override
    public AuthenticationResponse register(RegisterRequest request) {
        Set<Role> defaultRoles = roleRepository.findByNameIn(List.of("USER"));

        var user = User.builder()
                .email(request.getEmail())
                .password(passwordEncoder.encode(request.getPassword()))
                .roles(defaultRoles)
                .build();

        userRepository.save(user);

        return getAuthenticationResponse(user);
    }

    @Override
    public AuthenticationResponse authenticate(AuthenticationRequest request) {
        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        request.getEmail(),
                        request.getPassword()
                )
        );

        var user = userRepository.findByEmail(request.getEmail())
                .orElseThrow();

        return getAuthenticationResponse(user);
    }

    private AuthenticationResponse getAuthenticationResponse(User user) {
        var jwtToken = jwtService.generateToken(user);
        return AuthenticationResponse.builder()
                .token(jwtToken)
                .roles(user.getRoles())
                .build();
    }
}
