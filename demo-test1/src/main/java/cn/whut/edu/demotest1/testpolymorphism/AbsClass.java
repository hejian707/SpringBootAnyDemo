package cn.whut.edu.demotest1.testpolymorphism;

/**
 * @Author: hejian1@kingsoft.com
 * @Date: 2023/7/25 14:13
 */
public abstract class AbsClass implements InterfaceClass{

    public void method1() {
        System.out.println("Abstract method1");
        innerMethod();
    }

    public void innerMethod() {
        System.out.println("Abstract innerMethod");
    }
}
