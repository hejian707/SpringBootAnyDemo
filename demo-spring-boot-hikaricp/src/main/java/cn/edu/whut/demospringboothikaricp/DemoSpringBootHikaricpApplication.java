package cn.edu.whut.demospringboothikaricp;

import cn.edu.whut.demospringboothikaricp.autoconfiguration.MyHikari;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.sql.Connection;
import java.sql.SQLException;

@SpringBootApplication
public class DemoSpringBootHikaricpApplication {

    public static void main(String[] args) throws SQLException {
        ApplicationContext context = SpringApplication.run(DemoSpringBootHikaricpApplication.class, args);

        MyHikari myHikari = (MyHikari) context.getBean("MyHikari");
        Connection conn = myHikari.getDataSource().getConnection();
        System.out.println(myHikari.getDataSource().getConnection());
    }

}
