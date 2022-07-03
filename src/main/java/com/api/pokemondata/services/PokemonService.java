package com.api.pokemondata.services;

import java.util.List;
import java.util.UUID;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.api.pokemondata.models.Pokemon;
import com.api.pokemondata.repository.PokemonRepository;


@Service
public class PokemonService {
  final PokemonRepository pokemonRepository;

  public PokemonService(PokemonRepository pokemonRepository) {
    this.pokemonRepository = pokemonRepository;
  }

  public List<Pokemon> findAll() {
    return pokemonRepository.findAll();
  }

  @Transactional
  public Pokemon save (Pokemon pokemon) {
    return pokemonRepository.save(pokemon);
  }

  @Transactional
  public Pokemon getOne (UUID id) {
    return pokemonRepository.getById(id);
  }

  @Transactional
  public Pokemon updateOne (UUID id, Pokemon newPoke) {
    Pokemon pokemon = pokemonRepository.getById(id);
    pokemon = newPoke;
    return pokemonRepository.save(pokemon);
  }
  
}
