package cn.edu.whut.demospringboothikaricp.service;

import cn.edu.whut.demospringboothikaricp.mapper.UserMapper;
import cn.edu.whut.demospringboothikaricp.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: hejian1@kingsoft.com
 * @Date: 2023/1/29 18:45
 */
@Service("UserService")
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public User getUserById(int id) {
        return userMapper.getUserById(id);
    }
}
