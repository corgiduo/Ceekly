package com.corgiduo.ceekly.dao;

import com.corgiduo.ceekly.entity.UserInfo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.security.core.parameters.P;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Mapper
@Repository
public interface UserInfoMapper {

    @Insert("INSERT INTO user_info(user_id, nickname, email, avatar, create_date, update_date) " +
            "VALUES(#{user_id}, #{userInfo.nickname}, #{userInfo.email}, " +
            "#{userInfo.avatar}, #{userInfo.createDate}, #{userInfo.updateDate})")
    public int insertUserInfo(@Param("user_id") int userId,
                              @Param("userInfo") UserInfo userInfo);

    @Select("SELECT * FROM user_info WHERE user_id = #{user_id}")
    public int selectUserInfoByUserId(@Param("user_id") int userId);

}
