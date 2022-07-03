package com.api.pokemondata.services;

import java.util.List;
import java.util.UUID;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.api.pokemondata.models.User;
import com.api.pokemondata.repository.UserRepository;

@Service
public class UserService {

  final UserRepository userRepository;

  public UserService (UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  public List<User> findAll() {
    return userRepository.findAll();
  }

  public User findById (UUID id) {
    return userRepository.getById(id);
  }

  @Transactional
  public User save (User user) {
    return userRepository.save(user);
  }
  
}
