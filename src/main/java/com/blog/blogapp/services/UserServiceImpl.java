package com.blog.blogapp.services;

import com.blog.blogapp.entities.User;
import com.blog.blogapp.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User updateUser(User user, Long id) {
        User existing = userRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("User not found"));
        existing.setName(user.getName());
        existing.setEmail(user.getEmail());
        existing.setPassword(user.getPassword());
        existing.setAbout(user.getAbout());
        return userRepository.save(existing);
    }

    @Override
    public User getUserById(Long id) {
        return userRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("User not found"));
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}

