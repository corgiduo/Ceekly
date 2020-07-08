package com.corgiduo.ceekly.dao;

import com.corgiduo.ceekly.entity.Book;
import com.corgiduo.ceekly.entity.Report;
import com.corgiduo.ceekly.entity.User;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserMapper {

    @Insert("INSERT INTO user(username, password, nickname, avatar, email, create_date, update_date) " +
            "VALUES(#{user.username}, #{user.password}, #{user.nickname}, #{user.avatar}, " +
            "#{user.email}, #{user.createDate}, #{user.updateDate})")
    @Options(useGeneratedKeys = true, keyProperty = "user.id", keyColumn = "id")
    int insertUser(@Param("user")User user);

    @Delete("DELETE FROM user")
    int deleteAllUser();

    @Delete("DELETE FROM user WHERE username = #{username}")
    int deleteUserByUsername(@Param("username")String username);

    @Select("SELECT * FROM user WHERE id = #{id}")
    User selectUserById(@Param("id")int id);

    @Select("SELECT * FROM user")
    @Results(value = {
            @Result(property = "id", column = "id"),
            @Result(property = "bookList", column = "id", javaType = List.class,
                    many = @Many(select = "com.corgiduo.ceekly.dao.BookMapper.selectBookByUserId")),
            @Result(property = "reportList", column = "id", javaType = List.class,
                    many = @Many(select = "com.corgiduo.ceekly.dao.ReportMapper.selectReportByUserId"))
    })
    List<User> selectAllUser();

    @Select("SELECT * FROM user WHERE username = #{username}")
    User selectUserByUsername(@Param("username")String username);

}
