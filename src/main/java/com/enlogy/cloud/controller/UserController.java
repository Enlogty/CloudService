package com.enlogy.cloud.controller;

import com.enlogy.cloud.entity.User;
import com.enlogy.cloud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    private UserService userService;

    /**
     * 注册用户
     * @param user
     * @return "success" or "fail"
     */
    @PostMapping(value = "/insert")
    public User insertUser(User user) {
        return userService.insert(user);
    }

    /**
     * 修改密码
     * @param password
     * @param phoneNumber
     */
    @GetMapping (value = "/updatePassword")
    public void updatePassword(@RequestParam(value = "password") String password,@RequestParam(value = "phoneNumber")String phoneNumber){
        userService.updatePassword(password,phoneNumber);
    }

    /**
     * 修改用户名,暂时不提供实现
     * @param username
     * @param phoneNumber
     */
    @GetMapping(value = "/updateUsername")
    public void updateUsername(@RequestParam(value = "username") String username,@RequestParam(value = "phoneNumber")String phoneNumber){
        userService.updateUsername(username,phoneNumber);
    }

    /**
     * 验证用户名和密码
     * @param username
     * @param password
     * @return "success" or "fail"
     */
    @GetMapping(value = "/validLogin")
    public String validLogin(@RequestParam(value = "username") String username,@RequestParam(value = "password")String password){
        return userService.validLogin(username,password);
    }
    @GetMapping(value = "/queryAll")
    public List<User> findAllFromUser(){
        return userService.queryAll();
    }
}
