package com.db.stream.service;

import com.db.stream.entity.Game;
import com.db.stream.entity.Comment;
import com.db.stream.entity.GameCompany;
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

    public List<Game> getGameInfo(Integer game_id){
        //public JsonData getGameInfo(){
        //Map<String, Object> resultMap = new HashMap<>();
        List<Game> gameList = gameMapper.getGameInfo(game_id);
        return gameList;

    }
    public List<Comment> getGameComm(Integer game_id){
        //public JsonData getGameInfo(){
        //Map<String, Object> resultMap = new HashMap<>();
        List<Comment> commList = gameMapper.getGameComm(game_id);
        return commList;
    }

    public List<Integer> getGameNum() {
        return gameMapper.getGameNum();
    }

//    public List<Game> getUserGame(Integer u_id){
//        List<Game> list = gameMapper.selectUserGameByUserId(u_id);
//        return list;
//    }

}
