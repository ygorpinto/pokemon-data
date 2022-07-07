package com.api.pokemondata.repository;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.pokemondata.models.Skill;

@Repository
public interface SkillRepository extends JpaRepository<Skill, UUID> {

  Skill findByName(String name);
  
}
