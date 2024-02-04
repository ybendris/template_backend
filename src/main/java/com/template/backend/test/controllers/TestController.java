package com.template.backend.test.controllers;


import com.template.backend.test.dtos.Test;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/api/v1/test")
@SecurityRequirement(name= "bearerAuthentication")
public interface TestController {


    @GetMapping(value = "")
    ResponseEntity<Test> get();
}
