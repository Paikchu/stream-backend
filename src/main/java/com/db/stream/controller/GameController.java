package com.db.stream.controller;
import com.db.stream.entity.Game;
import com.db.stream.service.GameService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import java.util.List;

<<<<<<< Updated upstream
@RestController
=======
>>>>>>> Stashed changes
public class GameController {
    @Resource
    private GameService gameService;

    @GetMapping ("/home")
<<<<<<< Updated upstream
    public List<String> showHomepage(){
=======
    public List<Game> showHomepage(){
>>>>>>> Stashed changes
        System.out.println("get all game name, proceeding...\n");
        return gameService.getAllGame();
    }

}
