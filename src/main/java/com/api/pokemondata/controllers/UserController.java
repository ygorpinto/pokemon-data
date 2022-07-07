package com.api.pokemondata.controllers;

import java.time.LocalDate;

import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.pokemondata.DTO.UserDTO;
import com.api.pokemondata.models.User;
import com.api.pokemondata.services.UserService;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/api/v1/user")
public class UserController {
  
  @Autowired
  private UserService userService;

  @GetMapping
  public ResponseEntity<Object> listAll () {
    return ResponseEntity.status(HttpStatus.ACCEPTED).body(userService.findAll());
  }

  @PostMapping
  public ResponseEntity<Object> create (@RequestBody @Valid UserDTO userDTO) {
    User user = new User();

    BeanUtils.copyProperties(userDTO, user);

    user.setDateCreated(LocalDate.now());

    return ResponseEntity.status(HttpStatus.CREATED).body(userService.save(user));
  }
}
