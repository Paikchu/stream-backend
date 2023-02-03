package com.db.stream.service;

import com.db.stream.entity.User;
import com.db.stream.mapper.UserMapper;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
//import java.io

@Service
public class UserService {

    @Resource
    private UserMapper userMapper;
    public Map<String, Object> loginAccount(User user){
        Map<String, Object> resultMap = new HashMap<>();
        List<User> userList = userMapper.selectUserByEmail(user.getU_email());

        if(userList == null || userList.size() != 1){
            resultMap.put("code", 400);
            resultMap.put("message", "User does not exist");
            return resultMap;
        }

        User user1 = userList.get(0);
        if(user1.getU_permission().equals(1)){
            resultMap.put("code", 400);
            resultMap.put("message", "Access denied");
        }

        if(user1.getU_pwd().equals(user.getU_pwd())){
            resultMap.put("code", 200);
            resultMap.put("message", "Success");
        }
        else{
            resultMap.put("code", 400);
            resultMap.put("message", "Wrong email/password");
        }
        return resultMap;
    }

    public Map<String, Object> createAccount(User user){
        Map<String, Object> resultMap = new HashMap<>();
        List<User> userList = userMapper.selectUserByEmail(user.getU_email());
        if(!userList.isEmpty()){
            resultMap.put("code", 400);
            resultMap.put("message", "User have already existed");
            return resultMap;
        }
        else{
            Integer addUser = userMapper.createAccount(user);
            if(addUser > 0){
                resultMap.put("code", 200);
                resultMap.put("message", "Success");
            }
            else{
                resultMap.put("code", 400);
                resultMap.put("message", "Wrong email/password");
            }
        }
        return resultMap;
    }

    public List<String> getAllUserName(){
        List<String> usernames = userMapper.getAllUserName();
        return usernames;
    }
}
