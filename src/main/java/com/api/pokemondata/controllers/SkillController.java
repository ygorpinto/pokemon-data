package com.api.pokemondata.controllers;

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

import com.api.pokemondata.DTO.SkillDTO;
import com.api.pokemondata.models.Skill;
import com.api.pokemondata.services.SkillService;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/api/v1/skill")
public class SkillController {
  @Autowired
  private SkillService skillService;

  @PostMapping
  public ResponseEntity<Object> create (@RequestBody @Valid SkillDTO skillDTO) {

    Skill skill = new Skill();

    BeanUtils.copyProperties(skillDTO, skill);

    return ResponseEntity.status(HttpStatus.CREATED).body(skillService.save(skill));
  }

  @GetMapping
  public ResponseEntity<Object> listAll() {
    return ResponseEntity.status(HttpStatus.ACCEPTED).body(skillService.findAll());
  }
}
