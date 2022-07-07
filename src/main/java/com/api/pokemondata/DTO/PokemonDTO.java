package com.api.pokemondata.DTO;

import javax.validation.constraints.NotBlank;


public class PokemonDTO {

  @NotBlank
  private String name;

  @NotBlank
  private String logo;

  @NotBlank
  private String type;

  @NotBlank
  private String user;

  @NotBlank
  private String skill;



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

  public void setSkill(String skill) {
    this.skill = skill;
  }

  public void setUser(String user) {
    this.user = user;
  }

  public String getSkill() {
    return skill;
  }

  public String getUser() {
    return user;
  }
  
}
