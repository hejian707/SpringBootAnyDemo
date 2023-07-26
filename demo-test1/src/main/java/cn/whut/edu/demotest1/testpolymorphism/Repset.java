package cn.whut.edu.demotest1.testpolymorphism;

import lombok.Data;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

/**
 * @Author: hejian1@kingsoft.com
 * @Date: 2023/7/25 14:18
 */
@Data
@Service(value = "repset")
@Order(0)
public class Repset extends AbsClass{

    @Override
    public String getType() {
        return "repset";
    }

    @Override
    public void method1() {
        System.out.println("Repset method1");
        super.method1();
    }

    @Override
    public void innerMethod() {
        System.out.println("Repset innerMethod");
    }
}
