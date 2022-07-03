package com.api.pokemondata.models;

import java.io.Serializable;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SKILL")
public class Skill implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private UUID id;

  @Column(nullable = false, length = 100)
  private String name;

  @Column(nullable = false, length = 50)
  private Long power;

  @Column(nullable = false, length = 50)
  private Long cooldown;

  public String getName() {
    return name;
  }

  public Long getPower() {
    return power;
  }

  public UUID getId() {
    return id;
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
