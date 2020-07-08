package com.corgiduo.ceekly.dao;

import com.corgiduo.ceekly.entity.Book;
import com.corgiduo.ceekly.entity.User;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface BookMapper {

    @Insert("INSERT INTO book(user_id, title, status, create_date, update_date) " +
            "VALUES(#{user_id}, #{book.title}, #{book.status}, #{book.createDate}, #{book.updateDate})")
    @Options(useGeneratedKeys = true, keyProperty = "book.id", keyColumn = "id")
    public int insertBook(@Param("user_id")int userId,
                          @Param("book") Book book);

    @Select("SELECT * FROM book WHERE user_id = #{user_id} ORDER BY status DESC")
    public List<Book> selectBookByUserId(@Param("user_id")int userId);

}
