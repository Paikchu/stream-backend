package com.db.stream.service;

import com.db.stream.entity.*;
import com.db.stream.mapper.AdminMapper;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminService {

    @Resource
    private AdminMapper adminMapper;


    public List<Company> allCompanies() {
        return adminMapper.selectAllCom();
    }


    public List<User> allUser() {
        return adminMapper.selectAllUser();
    }

    public List<Company> modifyComPermission(Company company) {
        adminMapper.modifyComPermission(company.getC_id(), company.getC_permission() == 0 ? 1 : 0);
        return adminMapper.selectAllCom();
    }

    public List<Company> modifyComName(Company company) {
        adminMapper.modifyComName(company.getC_id(), company.getC_name());
        return adminMapper.selectAllCom();
    }

    public List<GameCompany> modifyGame(Game game){
        if(game.getG_name() != null){
            adminMapper.modifyGameName(game.getG_id(), game.getG_name());
        }
        else if(game.getG_price() != null){
            adminMapper.modifyGamePrice(game.getG_id(), game.getG_price());
        }
        else if(game.getG_tag() != null){
            adminMapper.modifyGameTag(game.getG_id(), game.getG_tag());
        }
        return adminMapper.allGame();

    }

    public List<Company> modifyComEmail(Company company) {
        adminMapper.modifyComEmail(company.getC_id(), company.getC_email());
        return adminMapper.selectAllCom();
    }


    public List<GameCompany> allGame()
    {
        return adminMapper.allGame();
    }

    public List<OrderUserGame> allOrder(){
        return adminMapper.allOrder();
    }

    public List<User> modifyUserPermission(User user) {
        adminMapper.modifyUserPermission(user.getU_id(), user.getU_permission() == 0 ? 1 : 0);
        return adminMapper.selectAllUser();
    }
}
