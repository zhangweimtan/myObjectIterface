package com.myjava01;
/*
    java语言的继承是单一继承，一个子类只能有一个父类；
    java语言给我们提供了一种机制，用于处理继承单一的局限性；
    接口
        比抽象类还抽象的类，接口类，所有的方法全是抽象方法
    接口和类的关系是实现，implements
    interface：

    格式：
        interface 接口名 {}


 */
public class InterfaceDemo {
    public static void main(String[] args) {
        BillGates bg = new BillGates();
        bg.code();
    }
}

class Boss{
    public void manage(){
        System.out.println("管理公司");
    }
}

class Progammer{
    public void code(){
        System.out.println("敲代码");
    }
}

class BillGates extends Progammer{

}