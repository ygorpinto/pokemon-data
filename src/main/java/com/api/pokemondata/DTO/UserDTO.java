package com.api.pokemondata.DTO;

import java.time.LocalDate;

import javax.validation.constraints.NotBlank;

public class UserDTO {


  @NotBlank
  private String logo;

  @NotBlank
  private String username;

  @NotBlank
  private String password;

  @NotBlank
  private String email;
 
  @NotBlank
  private LocalDate dateCreated;

  public String getEmail() {
    return email;
  }

  public String getLogo() {
    return logo;
  }

  public String getUsername() {
    return username;
  }

  public String getPassword() {
    return password;
  }

  public LocalDate getDateCreated() {
    return dateCreated;
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

  public void setDateCreated(LocalDate dateCreated) {
    this.dateCreated = dateCreated;
  }
}
