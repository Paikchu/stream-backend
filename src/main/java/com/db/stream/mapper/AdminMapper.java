package com.db.stream.mapper;

import com.db.stream.entity.*;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface AdminMapper {

    @Update("UPDATE Company SET c_permission = #{c_permission} WHERE c_id = #{c_id}")
    void modifyComPermission(@Param("c_id") Integer c_id, @Param("c_permission") Integer c_permission);
    @Update("UPDATE User SET u_permission = #{u_permission} WHERE u_id = #{u_id}")
    void modifyUserPermission(@Param("u_id") Integer u_id, @Param("u_permission") Integer u_permission);

    @Select("SELECT c_id, c_name, c_email, c_permission FROM Company")
    List<Company> selectAllCom();

    @Select("SELECT u_id, u_name, u_email, u_permission FROM User")
    List<User> selectAllUser();

    @Update("UPDATE Company SET c_name = #{c_name} WHERE c_id = #{c_id}")
    void modifyComName(@Param("c_id") Integer c_id, @Param("c_name") String c_name);

    @Update("UPDATE Company SET c_email = #{c_email} WHERE c_id = #{c_id}")
    void modifyComEmail(@Param("c_id") Integer c_id, @Param("c_email") String c_email);

    @Update("UPDATE Game SET g_name = #{g_name} WHERE g_id = #{g_id}")
    void modifyGameName(@Param("g_id") Integer g_id, @Param("g_name") String g_name);

    @Update("UPDATE Game SET g_price = #{g_price} WHERE g_id = #{g_id}")
    void modifyGamePrice(@Param("g_id") Integer g_id, @Param("g_price") Double g_price);

    @Update("UPDATE Game SET g_tag = #{g_tag} WHERE g_id = #{g_id}")
    void modifyGameTag(@Param("g_id") Integer g_id, @Param("g_tag") String g_tag);

    @Select("SELECT g_id, g_name, g_release_date, g_price, g_tag, c_name FROM Game, Company WHERE Game.g_cid = Company.c_id")
    List<GameCompany> allGame();

    @Select("SELECT o_id, u.u_name, g.g_name, o_value, o_time " +
            "FROM `Order` o, User u, Game g " +
            "WHERE o.o_uid = u.u_id AND o.o_gid = g.g_id")
    List<OrderUserGame> allOrder();
}
