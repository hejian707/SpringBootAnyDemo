package cn.edu.whut.demospringboothikaricp.mapper;

import cn.edu.whut.demospringboothikaricp.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

/**
 * @Author: hejian1@kingsoft.com
 * @Date: 2023/1/29 17:02
 */
@Mapper
public interface UserMapper {
    @Select("select * from user where id = #{id}")
    public User getUserById(int id);
}
