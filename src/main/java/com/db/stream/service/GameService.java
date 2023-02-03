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

<<<<<<< Updated upstream
    public List<String> getAllGame() {
=======
    public List<Game> getAllGame() {
>>>>>>> Stashed changes
        return gameMapper.selectAllGameNames();

    }
}
