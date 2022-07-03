package com.api.pokemondata.DTO;

import java.time.LocalDate;

import javax.validation.constraints.NotBlank;

import com.api.pokemondata.models.Skill;

public class PokemonDTO {

  @NotBlank
  private String name;

  @NotBlank
  private String logo;

  @NotBlank
  private String type;

  @NotBlank
  private Skill skill;

  @NotBlank
  private LocalDate dateCreated;


  public String getLogo() {
    return logo;
  }

  public Skill getSkill() {
    return skill;
  }

  public String getName() {
    return name;
  }

  public String getType() {
    return type;
  }

  public void setLogo(String logo) {
    this.logo = logo;
  }

  public void setSkill(Skill skill) {
    this.skill = skill;
  }

  public void setType(String type) {
    this.type = type;
  }

  public void setName(String name) {
    this.name = name;
  }
  
}
