package com.db.stream.service;
import com.db.stream.entity.Game;
import com.db.stream.entity.Comment;
import com.db.stream.entity.Library;
import com.db.stream.entity.LibGame;
import com.db.stream.entity.CartGame;
import com.db.stream.entity.CompanyGame;
import com.db.stream.mapper.GameMapper;
import com.db.stream.entity.GameDescription;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import com.db.stream.entity.Order;
import com.db.stream.entity.CartGame;
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

    public List<Game> getAllGames() {
        return gameMapper.selectAllGames();
    }

    public List<CompanyGame> getGameInfo(Integer game_id){
        List<CompanyGame> gameList = gameMapper.getGameInfo(game_id);
        return gameList;
    }
    public List<Game> getPrices(){
        List<Game> gameList = gameMapper.getPrices();
        return gameList;
    }
    public Double getGamePrice(Integer game_id){
        return gameMapper.getGamePrice(game_id);
    }
    public List<Comment> getGameComm(Integer game_id){
        List<Comment> commList = gameMapper.getGameComm(game_id);
        return commList;
    }
    public List<GameDescription> getGameDescription(Integer game_id){
        List<GameDescription> description = gameMapper.getGameDescription(game_id);
        return description;
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
    public Integer add_lib(Integer lib_uid,Integer lib_gid){
        return gameMapper.add_lib(lib_uid,lib_gid);
    }
    public Integer add_liborder(Order order){
        return gameMapper.add_liborder(order);
    }

    public List<CartGame> delete_cart(Integer cart_uid,Integer cart_gid){
        return gameMapper.delete_cart(cart_uid,cart_gid);
    }

    public List<CartGame> add_cart(Integer cart_uid,Integer cart_gid){
        return gameMapper.add_cart(cart_uid,cart_gid);
    }
    public Integer delete_cartorder(Order order){
        return gameMapper.delete_cartorder(order);
    }
    public Integer cart_purchase(Order order){
        gameMapper.add_liborder(order);
        gameMapper.add_order(order);
        return gameMapper.delete_cartorder(order);
    }

    public List<CartGame> getCartList(Integer user_id){
        List<CartGame> N = gameMapper.getCartGame(user_id);
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