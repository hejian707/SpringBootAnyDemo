package cn.edu.whut.demospringboothikaricp.model;

import lombok.Data;

/**
 * @Author: hejian1@kingsoft.com
 * @Date: 2023/1/29 17:07
 */
@Data
public class User {

    private Long id;
    private String name;
    private int age;
    private String email;
}
