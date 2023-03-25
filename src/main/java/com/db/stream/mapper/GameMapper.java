package com.db.stream.mapper;

import com.db.stream.entity.Game;
import com.db.stream.entity.Comment;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.data.util.Pair;

import java.util.List;


@Mapper
public interface GameMapper {
    @Select("SELECT g_name, g_id, g_tag, g_intro FROM game")
    List<String> selectAllGameNames();

    @Select("SELECT * FROM Game WHERE g_id = #{game_id}")
        //List<Game> getGameInfo();
    List<Game> getGameInfo(@Param("game_id") Integer game_id);

    @Select("SELECT * FROM Comment WHERE g_id = #{game_id}")
        //List<Game> getGameInfo();
    List<Comment> getGameComm(@Param("game_id") Integer game_id);

    @Select("SELECT g_id FROM Game")
    List<Integer> getGameNum();

//    @Select("SELECT g.g_id, g.g_name FROM Game as g JOIN Library as L on g.g_id = L.g_id JOIN User U on U.u_id = L.u_id WHERE U.u_id == #{u_id}")
//    List<Game> selectUserGameByUserId(@Param("u_id")Integer u_id);
}
