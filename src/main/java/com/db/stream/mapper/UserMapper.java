package com.db.stream.mapper;

import com.db.stream.entity.Company;
import com.db.stream.entity.Manager;
import com.db.stream.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {
    @Select("SELECT u_name, u_email, u_pwd, u_permission FROM User WHERE u_email = #{email}")
    List<User> selectUserByEmail(@Param("email") String email);

    @Select("SELECT u_name FROM User")
    List<String> getAllUserName();

    @Insert("INSERT INTO User(u_name, u_email, u_pwd)" + "VALUE(#{u_name}, #{u_email}, #{u_pwd})")
    Integer createUserAccount(User user);


    @Select("SELECT com_name, com_email, com_pwd, com_permission FROM Company WHERE com_email = #{email}")
    List<Company> selectComByEmail(@Param("email") String email);


    @Insert("INSERT INTO Company(com_name, com_email, com_pwd)" + "VALUE(#{com_name}, #{com_email}, #{com_pwd})")
    Integer createComAccount(Company company);


    @Select("SELECT m_name, m_email, m_pwd FROM Manager WHERE m_email = #{email}")
    List<Manager> selectManagerByEmail(@Param("email") String email);


    @Insert("INSERT INTO Manager(m_name, m_email, m_pwd)" + "VALUE(#{m_name}, #{m_email}, #{m_pwd})")
    Integer createManagerAccount(Manager manager);
}
