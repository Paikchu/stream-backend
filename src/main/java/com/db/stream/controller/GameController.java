package com.db.stream.controller;
import com.db.stream.entity.Game;
import com.db.stream.entity.Comment;
import com.db.stream.entity.GameCompany;
import com.db.stream.service.GameService;
import jakarta.annotation.Resource;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GameController {
    @Resource
    private GameService gameService;

    @GetMapping ("/home")
    public List<String> showHomepage(){
        System.out.println("get all game name, proceeding...\n");
        return gameService.getAllGame();
    }
    @RequestMapping("/game_show/{game_id}")
    public List<Game> game_show(@PathVariable Integer game_id) { return gameService.getGameInfo(game_id);}

    @RequestMapping("/comm_show/{game_id}")
    public List<Comment> comm_show(@PathVariable Integer game_id) { return gameService.getGameComm(game_id);}

    @RequestMapping("/numofgames")
    public List<Integer> numofgames() { return gameService.getGameNum();}

//
//    @GetMapping("/lib")
//    public List<Game> libGameList(@RequestParam Integer u_id){
//        return gameService.getUserGame(u_id);
//    }


    @GetMapping("/admin-table-game")
    public List<GameCompany> allGame(){
        return gameService.allGame();
    }
}
