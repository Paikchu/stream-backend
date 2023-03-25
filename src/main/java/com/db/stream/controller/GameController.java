package com.db.stream.controller;
import com.db.stream.entity.Game;
import com.db.stream.entity.Comment;
import com.db.stream.entity.GameCompany;
import com.db.stream.service.GameService;
import jakarta.annotation.Resource;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    @RequestMapping("/add_comm")
    public Integer add_comm(@RequestBody Comment comment) { return gameService.create_new_comm(comment);}

    @RequestMapping("/numofgames")
    public List<Game> numofgames() { return gameService.getGameNum();}

    @PostMapping("/search_game")
    public List<Game> searched_game(@RequestBody Map<String, String> requestBody){
        String game_name = requestBody.get("gamename");
        return gameService.searchgame(game_name);
    }


//
//    @GetMapping("/lib")
//    public List<Game> libGameList(@RequestParam Integer u_id){
//        return gameService.getUserGame(u_id);
//    }



}
