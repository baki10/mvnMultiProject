package com.bakigoal.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.time.Instant;

/**
 * Created by ilmir on 08.10.16.
 */
@Entity
public class Account extends Identified {

  @Column(unique = true)
  private String email;
  private String password;
  private String role = "ROLE_USER";
  private Instant created;

  public Account() {
  }

  public Account(String email, String password, String role) {
    this.email = email;
    this.password = password;
    this.role = role;
    this.created = Instant.now();
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  public Instant getCreated() {
    return created;
  }

  @Override
  public String toString() {
    return "Account{" +
        "email='" + email + '\'' +
        ", password='" + password + '\'' +
        ", role='" + role + '\'' +
        ", created=" + created +
        "} " + super.toString();
  }
}
