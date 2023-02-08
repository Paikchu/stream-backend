package com.db.stream.service;

import com.db.stream.entity.Game;
import com.db.stream.mapper.GameMapper;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class GameService {

    @Resource
    private GameMapper gameMapper;

    public List<String> getAllGame() {
        return gameMapper.selectAllGameNames();
    }

//    public List<Game> getUserGame(Integer u_id){
//        List<Game> list = gameMapper.selectUserGameByUserId(u_id);
//        return list;
//    }

}
