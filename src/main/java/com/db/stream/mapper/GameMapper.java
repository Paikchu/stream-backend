package com.db.stream.mapper;

import com.db.stream.entity.Game;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
@Mapper
public interface GameMapper {
    @Select("SELECT g_name FROM game")
<<<<<<< Updated upstream
    List<String> selectAllGameNames();
=======
    List<Game> selectAllGameNames();
>>>>>>> Stashed changes

}