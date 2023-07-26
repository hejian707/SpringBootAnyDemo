package cn.whut.edu.demotest1.testpolymorphism;

import lombok.Data;
import org.springframework.stereotype.Service;

/**
 * @Author: hejian1@kingsoft.com
 * @Date: 2023/7/25 14:16
 */
@Data
@Service(value = "cluster")
public class Cluster extends AbsClass{

    private String type = "cluster";
    @Override
    public void method1() {
        System.out.println("Cluster method1");
        super.method1();
    }

    @Override
    public void innerMethod() {
        System.out.println("Cluster innerMethod");
    }
}
