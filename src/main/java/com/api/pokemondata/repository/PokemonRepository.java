package com.api.pokemondata.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.pokemondata.models.Pokemon;

@Repository
public interface PokemonRepository extends JpaRepository<Pokemon, UUID> {
  
}
