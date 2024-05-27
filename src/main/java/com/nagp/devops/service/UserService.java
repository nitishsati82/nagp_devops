package com.nagp.devops.service;

import com.nagp.devops.model.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();

    void save(User user);
}
