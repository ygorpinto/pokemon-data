package com.api.pokemondata.models;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "USER")
public class User implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private UUID id;

  @Column(nullable = false, length = 200)
  private String logo;

  @Column(nullable = false, unique = true, length = 50)
  private String username;

  @Column(nullable = false, length = 50)
  private String password;

  @Column(nullable = false, length = 50)
  private String email;

  @Column(nullable = false)
  private LocalDate dateCreated;

  public String getUsername() {
    return username;
  }

  public String getEmail() {
    return email;
  }

  public UUID getId() {
    return id;
  }

  public String getLogo() {
    return logo;
  }

  public String getPassword() {
    return password;
  }

  public LocalDate getDate_created() {
    return dateCreated;
  }

  public void setDate_created(LocalDate date_created) {
    this.dateCreated = date_created;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public void setLogo(String logo) {
    this.logo = logo;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public void setUsername(String username) {
    this.username = username;
  }

}
