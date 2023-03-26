package com.db.stream.controller;

import com.db.stream.entity.*;
import com.db.stream.service.AdminService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AdminController {

    @Resource
    private AdminService adminService;

    @GetMapping(value = "/admin-table-c")
    public List<Company> allCompanies() {
        return adminService.allCompanies();
    }

    @GetMapping(value = "/admin-table-user")
    public List<User> allUser() {
        return adminService.allUser();
    }

    @PostMapping("/admin-access-c")
    public List<Company> modifyComPermission(@RequestBody Company company) {
        return adminService.modifyComPermission(company);
    }

    @PostMapping("/admin-access-u")
    public List<User> modifyUserPermission(@RequestBody User user) {
        return adminService.modifyUserPermission(user);
    }

    @PostMapping("/admin-c-change-name")
    public List<Company> modifyComName(@RequestBody Company company) {
        return adminService.modifyComName(company);
    }

    @PostMapping("/admin-c-change-email")
    public List<Company> modifyComEmail(@RequestBody Company company) {
        return adminService.modifyComEmail(company);
    }


    @PostMapping("/admin-g-change")
    public List<GameCompany> modifyGame(@RequestBody Game game){
        return adminService.modifyGame(game);
    }

    @GetMapping("/admin-table-game")
    public List<GameCompany> allGame(){
        return adminService.allGame();
    }

    @GetMapping("/admin-table-order")
    public List<OrderUserGame> allOrder(){
        return adminService.allOrder();
    }
}
