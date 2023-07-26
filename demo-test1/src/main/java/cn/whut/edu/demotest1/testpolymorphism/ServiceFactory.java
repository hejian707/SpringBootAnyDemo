package cn.whut.edu.demotest1.testpolymorphism;

import lombok.Data;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.util.*;

/**
 * @Author: hejian1@kingsoft.com
 * @Date: 2023/7/25 14:24
 */
@Data
@Component(value = "serviceFactory")
public class ServiceFactory{

    @Autowired
    private Map<String, InterfaceClass> serviceMap= new HashMap<>();
    @Autowired
    private Set<InterfaceClass> serviceSet = new HashSet<>();
    @Autowired
    private List<InterfaceClass> serviceList;

//    @Override
//    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
//        serviceMap = applicationContext.getBeansOfType(InterfaceClass.class);
//    }

//    @Autowired
//    public ServiceFactory(Set<InterfaceClass> serviceSet) {
//        this.serviceSet = serviceSet;
//    }

    public Map<String, InterfaceClass> getServiceMap() {
        return serviceMap;
    }

    public InterfaceClass byType(String type) {
        for (InterfaceClass service : serviceSet) {
            if (service.getType().equals(type)) {
                return service;
            }
        }
        return null;
    }
}
