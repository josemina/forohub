package com.josemina.forohub.controllers;

import com.josemina.forohub.controllers.dto.AuthCreateUserRequest;
import com.josemina.forohub.controllers.dto.AuthLoginRequest;
import com.josemina.forohub.controllers.dto.AuthResponse;
import com.josemina.forohub.service.impl.UserDetailsServiceImpl;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthenticationController {

    @Autowired
    private UserDetailsServiceImpl userDetailsService;

    @PostMapping("/signup")
    public ResponseEntity<AuthResponse>register(@RequestBody @Valid AuthCreateUserRequest authCreateUser) {
        return new ResponseEntity<>(this.userDetailsService.createUser(authCreateUser), HttpStatus.CREATED);
    }

    @PostMapping("/login")
    public ResponseEntity<AuthResponse> login(@RequestBody @Valid AuthLoginRequest userRequest){
        return new ResponseEntity<>(this.userDetailsService.loginUser(userRequest), HttpStatus.OK);
    }

}

