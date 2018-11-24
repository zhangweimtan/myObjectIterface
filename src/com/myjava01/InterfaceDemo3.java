package com.myjava01;
/*
    类与类的关系：继承关系，单一继承，多层继承
    类与接口：实现关系，一个类实现接口，必须实现所有方法（抽象方法），？单一实现，多个实现？
        多个实现,
    接口与接口：
        继承关系，多层继承
 */

public class InterfaceDemo3 {
}

interface InterA {
    public abstract void function();

}

interface InterB extends InterA {
    public abstract void method();
}

interface InterC extends InterB{

}

class Demo implements InterC{

    @Override
    public void method() {

    }

    @Override
    public void function() {

    }
}