package com.db.stream.controller;

import com.db.stream.entity.User;
import com.db.stream.service.UserService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping(value = "/sign-in")
    public Map<String, Object> loginAccount(@RequestBody User user){
        return userService.loginAccount(user);
    }

    @PostMapping("/sign-up")
    public Map<String, Object> createAccount(@RequestBody User user){
        return userService.createAccount(user);
    }

}
