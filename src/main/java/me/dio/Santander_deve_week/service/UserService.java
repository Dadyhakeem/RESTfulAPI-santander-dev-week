package me.dio.Santander_deve_week.service;

import org.springframework.stereotype.Service;

import me.dio.Santander_deve_week.domain.model.User;
@Service
public interface UserService {
    User findById(Long id);
    User create(User userToCreate);
}
