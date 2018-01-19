package com.enlogy.cloud.service;

import com.enlogy.cloud.entity.User;

import java.util.List;

public interface UserService {
    User insert(User user);
    void delete();
    String updatePassword(String password,String phoneNumber);
    void updateUsername(String username,String phoneNumber);
    List<User> queryAll();
    String validLogin(String username,String password);
}
