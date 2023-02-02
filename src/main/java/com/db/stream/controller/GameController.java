package com.db.stream.controller;
import com.db.stream.entity.Game;
import com.db.stream.service.GameService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class GameController {
    @Resource
    private GameService gameService;

    @GetMapping ("/home")
    public List<Game> showHomepage(){
        System.out.println("get all game name, proceeding...\n");
        return gameService.getAllGame();
    }

}
