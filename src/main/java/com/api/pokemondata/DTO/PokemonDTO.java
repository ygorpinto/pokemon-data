package com.api.pokemondata.DTO;

import java.time.LocalDate;
import java.util.UUID;

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
  private String userId;

  @NotBlank
  private String skillId;



  public String getLogo() {
    return logo;
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

  public void setType(String type) {
    this.type = type;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setSkillId(String skillId) {
    this.skillId = skillId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public String getSkillId() {
    return skillId;
  }

  public String getUserId() {
    return userId;
  }
  
}
