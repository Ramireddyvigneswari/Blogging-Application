package com.blog.blogapp.services;

import com.blog.blogapp.entities.User;
import java.util.List;

public interface UserService {

    User createUser(User user);
    User updateUser(User user, Long id);
    User getUserById(Long id);
    List<User> getAllUsers();
    void deleteUser(Long id);
}
