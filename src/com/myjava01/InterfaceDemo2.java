package com.myjava01;
/*
    接口成员特点
        只能有抽象方法
        只能有常量；
        默认使用public & abstract方法;可以省略
        只能使用public & abstract方法，不能使用private修饰
        默认使用public static final 来修饰常量
    建议：手动给上默认修饰符
    注意：

        接口不能创建对象（不能实例化）
        类与接口的关系是实现关系，一个类实现一个接口必须实现它所有的方法
                抽象方法

 */
public class InterfaceDemo2 {
    public static void main(String[] args) {

    }
}

interface Animal{
    public static final int num = 10;
    void eat();
}

class Cat implements Animal{

    @Override
    public void eat() {

    }
}


