package com.db.stream.mapper;

import com.db.stream.entity.Game;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;


@Mapper
public interface GameMapper {
    @Select("SELECT g_name, g_id, g_tag, g_intro FROM game")
    List<String> selectAllGameNames();

    @Select("SELECT g.g_id, g.g_name FROM Game as g JOIN Library as L on g.g_id = L.g_id JOIN User U on U.u_id = L.u_id WHERE U.u_id == #{u_id}")
    List<Game> selectUserGameByUserId(@Param("u_id")Integer u_id);
}
