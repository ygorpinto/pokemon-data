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

import com.api.pokemondata.DTO.PokemonDTO;
import com.api.pokemondata.models.Pokemon;
import com.api.pokemondata.services.PokemonService;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/pokemon")
public class PokemonController {

  @Autowired
  private PokemonService pokemonService;

  @GetMapping
  public ResponseEntity<Object> listAll () {
    return ResponseEntity.status(HttpStatus.ACCEPTED).body(pokemonService.findAll());
  }

  @PostMapping
  public ResponseEntity<Object> create (@RequestBody @Valid PokemonDTO pokemonDTO) {
    Pokemon pokemon = new Pokemon();

    BeanUtils.copyProperties(pokemonDTO, pokemon);
  
    pokemon.setDateCreated(LocalDate.now());

    return ResponseEntity.status(HttpStatus.CREATED).body(pokemonService.save(pokemon));
  }
}
