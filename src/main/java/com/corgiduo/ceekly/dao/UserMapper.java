package com.corgiduo.ceekly.dao;

import com.corgiduo.ceekly.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserMapper {

    @Select("SELECT * FROM user")
    public List<User> selectAllUser();

    @Select("SELECT * FROM user WHERE username = #{username}")
    public User selectUserByUsername(@Param("username") String username);

}
