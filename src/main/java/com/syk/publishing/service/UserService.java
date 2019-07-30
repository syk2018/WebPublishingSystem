package com.syk.publishing.service;

import com.syk.publishing.mbg.model.Users;

import java.util.List;

public interface UserService {
    List<Users> getUserByUsername(Users user);

    Users getUserById(Long id);

    int createUser(Users user);

    int updateUser(Long id,Users user);

    int deleteUser(Long id);

    List<Users> login(Users user);
}
