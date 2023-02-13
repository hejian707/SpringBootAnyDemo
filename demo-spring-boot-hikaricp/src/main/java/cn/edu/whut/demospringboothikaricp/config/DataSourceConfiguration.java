package cn.edu.whut.demospringboothikaricp.config;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * @Author: hejian1@kingsoft.com
 * @Date: 2023/1/30 10:05
 */
@Configuration
public class DataSourceConfiguration {

    @Autowired
    private DataSource dataSource;

//    @Bean
//    public SqlSessionFactoryBean getSqlSessionFactory() {
//        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
//        sqlSessionFactoryBean.setDataSource(dataSource);
//        return sqlSessionFactoryBean;
//    }
}
