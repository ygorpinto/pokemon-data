package com.api.pokemondata.models;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Optional;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "POKEMON")
public class Pokemon implements Serializable {
  private static final long serialVersionUID = 1L;

  @OneToOne
  @JoinColumn(name = "user_id")
  private User user;

  @OneToOne
  @JoinColumn(name = "skill_id")
  private Skill skill;

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private UUID id;

  @Column(nullable = false, unique = true, length = 20)
  private String name;

  @Column(nullable = false, length = 255)
  private String logo;

  @Column(nullable = false, length = 50)
  private String type;

  @Column(nullable = false)
  private LocalDate dateCreated;

  public String getLogo() {
    return logo;
  }

  public String getName() {
    return name;
  }


  public String getType() {
    return type;
  }


  public LocalDate getDateCreated() {
    return dateCreated;
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

  public void setDateCreated(LocalDate date_created) {
    this.dateCreated = date_created;
  }

  public UUID getId() {
    return id;
  }

  public Skill getSkill() {
    return skill;
  }

  public User getUser() {
    return user;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public void setSkill(Skill skill) {
    this.skill = skill;
  }

  public void setUser(User user) {
    this.user = user;
  }

}
