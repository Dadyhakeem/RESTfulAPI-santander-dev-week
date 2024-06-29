package me.dio.Santander_deve_week.service.Imp;

import java.util.NoSuchElementException;

import org.springframework.stereotype.Service;

import me.dio.Santander_deve_week.domain.model.User;
import me.dio.Santander_deve_week.domain.repository.UserRepository;
import me.dio.Santander_deve_week.service.UserService;
@Service
public class UserServiceImp implements UserService{

    private final UserRepository userRepository;

    public UserServiceImp(UserRepository userRepository)
    {
        this.userRepository = userRepository;
    }

    @Override
    public User findById(Long id) {
       return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User create(User userToCreate) {
        if (userRepository.existsByAccountNumber(userToCreate.getAccount().getNumber())) {
            throw new IllegalArgumentException("this account number already exists.");
        }
       return userRepository.save(userToCreate);
    }
    
}
