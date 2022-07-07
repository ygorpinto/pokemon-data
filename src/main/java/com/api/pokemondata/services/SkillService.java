package com.api.pokemondata.services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.api.pokemondata.models.Skill;
import com.api.pokemondata.repository.SkillRepository;

@Service
public class SkillService {
  final SkillRepository skillRepository;

  public SkillService(SkillRepository skillRepository) {
    this.skillRepository = skillRepository;
  }

  @Transactional
  public Skill save (Skill skill) {
    return skillRepository.save(skill);
  }

  public List<Skill> findAll() {
    return skillRepository.findAll();
  }

  public Skill findOne (UUID id) {
    return skillRepository.getById(id);
  }

  public Skill findByName (String name) {
    return skillRepository.findByName(name);
  }

}
