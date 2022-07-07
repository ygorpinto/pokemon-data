package com.api.pokemondata.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.pokemondata.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, UUID> {
  User findByEmail(String email);
}
