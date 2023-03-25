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

    @Insert("INSERT INTO User(u_name, u_email, u_pwd)" + "VALUE(#{u_name}, #{u_email}, #{u_pwd})")
    Integer createUserAccount(User user);


    @Select("SELECT c_name, c_email, c_pd, c_permission FROM Company WHERE c_email = #{email}")
    List<Company> selectComByEmail(@Param("email") String email);


    @Insert("INSERT INTO Company(c_name, c_email, c_pd)" + "VALUE(#{c_name}, #{c_email}, #{c_pd})")
    Integer createComAccount(Company company);


    @Select("SELECT m_name, m_email, m_pwd FROM Manager WHERE m_email = #{email}")
    List<Manager> selectManagerByEmail(@Param("email") String email);

    @Select("SELECT c_id, c_name, c_email, c_permission FROM Company")
    List<Company> selectAllCom();

    @Select("SELECT u_id, u_name, u_email, u_permission FROM User")
    List<User> selectAllUser();

    @Insert("INSERT INTO Manager(m_name, m_email, m_pwd)" + "VALUE(#{m_name}, #{m_email}, #{m_pwd})")
    Integer createManagerAccount(Manager manager);
}
