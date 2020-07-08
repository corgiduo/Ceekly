package com.corgiduo.ceekly.dao;

import com.corgiduo.ceekly.entity.Report;
import com.corgiduo.ceekly.entity.User;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ReportMapper {

    @Insert("INSERT INTO report(user_id, type, report_content, plan_content, create_date, update_date) " +
            "VALUES(#{user_id}, #{report.type}, #{report.reportContent}, " +
            "#{report.planContent}, #{report.createDate}, #{report.updateDate})")
    @Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "id")
    public int insertReport(@Param("user_id")int userId,
                            @Param("report")Report report);

    @Delete("DELETE FROM report WHERE id = #{id}")
    public int deleteReportById(@Param("id")int id);

    @Select("SELECT * FROM report WHERE user_id = #{user_id}")
    public List<Report> selectReportByUserId(@Param("user_id")int userId);

    @Select("SELECT * FROM report")
    @Results(value = {
            @Result(property = "id", column = "id"),
            @Result(property = "user", column = "user_id", javaType = User.class,
                    one = @One(select = "com.corgiduo.ceekly.dao.UserMapper.selectUserById"))
    })
    public List<Report> selectAllReport();

}
