package com.afanasev.spring_boot.service;


import com.afanasev.spring_boot.model.User;

import java.util.List;

public interface UserService {

    List<User> getUsers();

    void saveUser(User user);

    User getUser(int id);

    User update(User updatedUser);

    void deleteUser(User user);

    void deleteById(int id);

}
