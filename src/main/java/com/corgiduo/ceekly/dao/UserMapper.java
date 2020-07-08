package com.corgiduo.ceekly.dao;

import com.corgiduo.ceekly.entity.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Mapper
@Repository
public interface UserMapper {

    @Insert("INSERT INTO user(username, password, create_date, update_date) " +
            "VALUES(#{user.username}, #{user.password}, #{user.createDate}, #{user.updateDate})")
    @Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "id")
    public int insertUser(@Param("user") User user);

    @Select("SELECT * FROM user")
    public List<User> selectAllUser();

    @Select("SELECT * FROM user WHERE username = #{username}")
    public User selectUserByUsername(@Param("username") String username);

}
