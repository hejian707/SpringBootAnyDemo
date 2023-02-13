package cn.edu.whut.demospringboothikaricp;


import cn.edu.whut.demospringboothikaricp.model.User;
import cn.edu.whut.demospringboothikaricp.service.UserService;
import com.zaxxer.hikari.HikariDataSource;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@SpringBootApplication
@MapperScan(basePackages = {"cn.edu.whut.demospringboothikaricp.mapper"})
public class DemoSpringBootHikaricpApplication {

    public static void main(String[] args) throws SQLException {
        ApplicationContext context = SpringApplication.run(DemoSpringBootHikaricpApplication.class, args);

//        MyHikari myHikari = (MyHikari) context.getBean("MyHikari");
//        Connection conn = myHikari.getDataSource().getConnection();
//        System.out.println(conn);
//        SqlSessionFactoryBean bean = context.getBean(SqlSessionFactoryBean.class);

        HikariDataSource hikariDataSource = (HikariDataSource) context.getBean(DataSource.class);
        UserService userService = (UserService) context.getBean("UserService");
        User user = userService.getUserById(21);
        System.out.println(user.getAge());

//        MyDruid myDruid = (MyDruid) context.getBean("MyDruid");
//        DataSource dataSource = myDruid.getDataSource();
//        Connection connection = dataSource.getConnection();
//        System.out.println(connection);
    }

}
