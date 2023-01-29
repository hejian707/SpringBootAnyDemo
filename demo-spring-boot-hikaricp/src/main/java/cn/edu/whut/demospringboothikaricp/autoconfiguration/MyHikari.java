package cn.edu.whut.demospringboothikaricp.autoconfiguration;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

/**
 * @Author: hejian1@kingsoft.com
 * @Date: 2023/1/28 20:08
 */
@Data
@Component("MyHikari")
public class MyHikari {

    @Autowired
    private DataSource dataSource;
}
