package com.enlogy.cloud.service.impl;

import com.enlogy.cloud.entity.User;
import com.enlogy.cloud.repository.UserRepository;
import com.enlogy.cloud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;
    @Override
    public User insert(User user) {
        System.out.println("访问insert");
        user.setUsername(user.getUsername());
        user.setPassword(user.getPassword());
        user.setPhoneNumber(user.getPhoneNumber());
        return userRepository.save(user);

    }

    @Override
    public void delete() {

    }

    @Override
    public String updatePassword( String password, String phone_number) {
        User user = userRepository.findByPhoneNumber(phone_number);
        user.setPassword(password);
        userRepository.save(user);
        return "success";
    }

    @Override
    public void updateUsername(String username, String phone_number) {

    }

    @Override
    public String validLogin(String username, String password) {
        User user = userRepository.findByUsername(username);
        if (user.getPassword().equals(password)){
            return "success";
        }
        return "fail";
    }

    @Override
    public List<User> queryAll() {
       return userRepository.findAll();
    }
}
