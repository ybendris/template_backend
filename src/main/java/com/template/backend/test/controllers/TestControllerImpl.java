package com.template.backend.test.controllers;

import com.template.backend.test.dtos.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestControllerImpl implements TestController{
    @Override
    public ResponseEntity<Test> get() {
        return ResponseEntity.ok(new Test("code", "message"));
    }
}
