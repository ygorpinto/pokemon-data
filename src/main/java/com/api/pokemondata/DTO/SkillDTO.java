package com.api.pokemondata.DTO;

import javax.validation.constraints.NotBlank;

public class SkillDTO {

  @NotBlank
  private String name;

  @NotBlank
  private Long power;

  @NotBlank
  private Long cooldown;

  public String getName() {
    return name;
  }

  public Long getPower() {
    return power;
  }

  public Long getCooldown() {
    return cooldown;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setPower(Long power) {
    this.power = power;
  }

  public void setCooldown(Long cooldown) {
    this.cooldown = cooldown;
  }
  
}
