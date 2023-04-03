package com.db.stream.mapper;

import com.db.stream.entity.Game;
import com.db.stream.entity.Comment;
import com.db.stream.entity.LibGame;
import com.db.stream.entity.Order;
import com.db.stream.entity.CartGame;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Delete;

import java.util.List;


@Mapper
public interface GameMapper {
    @Select("SELECT g_name, g_id, g_tag, g_intro FROM game")
    List<String> selectAllGameNames();

    @Select("SELECT * FROM Game WHERE g_id = #{game_id}")
    List<Game> getGameInfo(@Param("game_id") Integer game_id);
    @Select("SELECT * FROM Game")
    List<Game> getPrices();

    @Select("SELECT g_price FROM Game WHERE g_id = #{game_id}")
    Double getGamePrice(@Param("game_id") Integer game_id);

    @Select("SELECT * FROM Comment WHERE com_gid = #{game_id}")
    List<Comment> getGameComm(@Param("game_id") Integer game_id);
    @Delete("DELETE FROM `Order` WHERE o_id = #{oid}")
    List<Order> delete_order(@Param("oid") Integer oid);

    @Delete("DELETE FROM Cart WHERE cart_uid = #{cart_uid} AND cart_gid = #{cart_gid}")
        //List<Game> getGameInfo();
    List<CartGame> delete_cart(@Param("cart_uid") Integer cart_uid, @Param("cart_gid") Integer cart_gid);
    @Delete("DELETE FROM Cart WHERE cart_uid = #{o_uid} AND cart_gid = #{o_gid}")
    Integer delete_cartorder(Order order);

    @Select("SELECT * FROM Game")
    List<Game> getGameNum();

    @Select("SELECT * FROM Comment")
    List<Comment> getAllComm();

    @Insert("INSERT INTO Comment(com_gid,com_content,com_date)" + "VALUE(#{com_gid},#{com_content},NOW())")
    Integer create_new_comm(Comment comment);

    @Select("SELECT * FROM Game WHERE g_name like '%${g_name}%'")
    List<Game> searchgame(@Param("g_name") String g_name);


    @Select("SELECT * FROM Library,Game WHERE lib_uid = #{user_id} AND lib_gid = g_id")
    List<LibGame> getGameList(@Param("user_id") Integer user_id);
    @Insert("INSERT INTO Library(lib_uid,lib_gid) VALUE(#{lib_uid},#{lib_gid})")
    Integer add_lib(@Param("lib_uid") Integer lib_uid, @Param("lib_gid") Integer lib_gid);

    @Insert("INSERT INTO Library VALUE(#{o_uid},#{o_gid})")
    Integer add_liborder(Order order);
    @Insert("INSERT INTO `Order`(o_gid,o_uid,o_value,o_time) VALUE(#{o_gid},#{o_uid},#{o_value},NOW())")
    Integer add_order(Order order);

    @Select("SELECT * FROM `Order` WHERE o_uid = #{user_id}")
    List<Order> getOrderList(@Param("user_id") Integer user_id);

    @Select("SELECT * FROM Cart,Game WHERE cart_uid = #{user_id} AND cart_gid = g_id")
    List<CartGame> getCartGame(@Param("user_id") Integer user_id);



//    @Select("SELECT g.g_id, g.g_name FROM Game as g JOIN Library as L on g.g_id = L.g_id JOIN User U on U.u_id = L.u_id WHERE U.u_id == #{u_id}")
//    List<Game> selectUserGameByUserId(@Param("u_id")Integer u_id);
}
