package com.db.stream.service;
import com.db.stream.entity.Game;
import com.db.stream.entity.Comment;
import com.db.stream.entity.Library;
import com.db.stream.entity.LibGame;
import com.db.stream.mapper.GameMapper;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import com.db.stream.entity.Order;
import java.util.List;
import java.util.Arrays;
import java.util.Map;

import static com.db.stream.utils.RequestResponse.result;

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

    public void delete_order(Integer oid){
        //public JsonData getGameInfo(){
        //Map<String, Object> resultMap = new HashMap<>();
        gameMapper.delete_order(oid);
    }

    public List<Game> getGameNum() {
        List<Game> N = gameMapper.getGameNum();
        return N;
    }
    public List<Comment> getAllComm() {
        List<Comment> N = gameMapper.getAllComm();
        return N;
    }

    /*public Integer create_new_comm(Comment comment) {
        Integer comm = gameMapper.create_new_comm(comment);
        if (comm > 0) {
            return 1;
        } else {
          return 0;
        }
    }*/


    public Map<String, Object> create_new_comm(Comment comment) {
        if(gameMapper.create_new_comm(comment) > 0){
            return result(200, "success");
        }
        else{
            return result(400, "Cannot add comment");
        }
    }



    public List<LibGame> getGameList(Integer user_id){
        List<LibGame> N = gameMapper.getGameList(user_id);
        return N;
    }

    public List<Order> getOrderList(Integer user_id){
        List<Order> N = gameMapper.getOrderList(user_id);
        return N;
    }


    public List<Game> searchgame(String gamename){
        return gameMapper.searchgame(gamename);
    }

}
