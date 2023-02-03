package com.db.stream.controller;

import com.db.stream.entity.Company;
import com.db.stream.entity.Manager;
import com.db.stream.entity.User;
import com.db.stream.service.UserService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class UserController {
    @Resource
    private UserService userService;

    @PostMapping("/user-sign-in")
    public Map<String, Object> loginUserAccount(@RequestBody User user) {
        return userService.loginUserAccount(user);
    }

    @PostMapping("/user-sign-up")
    public Map<String, Object> createUserAccount(@RequestBody User user) {
        return userService.createUserAccount(user);
    }

    @PostMapping("/com-sign-in")
    public Map<String, Object> loginComAccount(@RequestBody Company company) {
        return userService.loginComAccount(company);
    }

    @PostMapping("/com-sign-up")
    public Map<String, Object> createComAccount(@RequestBody Company company) {
        return userService.createComAccount(company);
    }


    @PostMapping("/man-sign-in")
    public Map<String, Object> loginManagerAccount(@RequestBody Manager manager) {
        return userService.loginManagerAccount(manager);
    }

    @PostMapping("/man-sign-up")
    public Map<String, Object> createManagerAccount(@RequestBody Manager manager) {
        return userService.createManagerAccount(manager);
    }

}
