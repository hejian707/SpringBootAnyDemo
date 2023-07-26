package cn.whut.edu.demotest1.testpolymorphism;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.Set;

/**
 * @Author: hejian1@kingsoft.com
 * @Date: 2023/7/25 16:15
 */
@Data
@Component
public class BoClass {
    @Autowired
    private ServiceFactory serviceFactory;

    @Autowired
    private Cluster cluster;

    public void method() {
        Map<String, InterfaceClass> serviceMap = serviceFactory.getServiceMap();
        Set<InterfaceClass> serviceSet = serviceFactory.getServiceSet();
        System.out.println("get");
    }
}
