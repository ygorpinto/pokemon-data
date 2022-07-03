package com.api.pokemondata.DTO;

import javax.validation.constraints.NotBlank;

public class SkillDTO {

  @NotBlank
  private String name;

  @NotBlank
  private String power;

  @NotBlank
  private String cooldown;

  public String getName() {
    return name;
  }

  public String getPower() {
    return power;
  }

  public String getCooldown() {
    return cooldown;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setPower(String power) {
    this.power = power;
  }

  public void setCooldown(String cooldown) {
    this.cooldown = cooldown;
  }
  
}
