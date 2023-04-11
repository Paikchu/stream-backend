package com.db.stream.mapper;

import com.db.stream.entity.Company;
import com.db.stream.entity.Manager;
import com.db.stream.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {
    @Select("SELECT u_id, u_name, u_email, u_pd, u_permission FROM User WHERE u_email = #{email}")
    List<User> selectUserByEmail(@Param("email") String email);

    @Insert("INSERT INTO User(u_name, u_email, u_pd)" + "VALUE(#{u_name}, #{u_email}, #{u_pd})")
    Integer createUserAccount(User user);


    @Select("SELECT c_name, c_email, c_pd, c_permission FROM Company WHERE c_email = #{email}")
    List<Company> selectComByEmail(@Param("email") String email);


    @Insert("INSERT INTO Company(c_name, c_email, c_pd)" + "VALUE(#{c_name}, #{c_email}, #{c_pd})")
    Integer createComAccount(Company company);


    @Select("SELECT m_name, m_email, m_pd FROM Manager WHERE m_email = #{email}")
    List<Manager> selectManagerByEmail(@Param("email") String email);

    @Insert("INSERT INTO Manager(m_name, m_email, m_pd)" + "VALUE(#{m_name}, #{m_email}, #{m_pd})")
    Integer createManagerAccount(Manager manager);

}
