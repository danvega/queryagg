package com.therealdanvega.service;

import com.therealdanvega.domain.User;
import com.therealdanvega.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Iterable<User> list() {
        return userRepository.findAll();
    }

    public int getAverageAge() {
        return userRepository.getAverageAge();
    }

    public int getMaxAge(String name) {
        return userRepository.getMaxAgeMinus(name);
    }
}
