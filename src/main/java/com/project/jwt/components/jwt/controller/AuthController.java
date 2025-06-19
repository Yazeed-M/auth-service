package com.project.jwt.components.jwt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.jwt.components.jwt.util.JwtUtil;

@RestController
@RequestMapping(path ="api/auth")
public class AuthController {
    @Autowired
    private final JwtUtil jwtUtil;

    public AuthController(JwtUtil jwtUtil){
        this.jwtUtil=jwtUtil;
    }

@GetMapping("/{name}")
public ResponseEntity<String> generateToken(@PathVariable String name) {
    String token = jwtUtil.generateToken(name);
    return ResponseEntity.ok(token);
}
}
