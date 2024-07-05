package com.josemina.forohub.controllers;


import com.josemina.forohub.controllers.dto.UserDTO;
import com.josemina.forohub.persistence.repository.UserRepository;
import com.josemina.forohub.service.impl.UsersServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/users")
public class UsersController {

    @Autowired
    private UserRepository userRepository;

    private UsersServiceImp usersServiceImp;



    @GetMapping
    public ResponseEntity<?> findAll(){
        List<UserDTO> users = usersServiceImp.findAll()
                .stream().map(userEntity -> UserDTO.builder()
                        .username(userEntity.getUsername())
                        .email(userEntity.getEmail())
                        .isEnabled(userEntity.isEnabled()).build()).toList();
        return ResponseEntity.ok(users);
    }

}
