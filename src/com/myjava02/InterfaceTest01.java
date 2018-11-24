package com.myjava02;
/*
    案例：
    篮球运动员和教练
    乒乓球运动员和教练
    现在篮球运动员和教练要出国访问，需要学习英语
    根据所有知识，分析出来那些事类，那些是抽象类，那些是接口
 */
public class InterfaceTest01 {
    public static void main(String[] args) {
        BasketBallPlayer bbp = new BasketBallPlayer();
        bbp.name = "姚明";
        bbp.age = 35;
        bbp.gender = "男";
        bbp.study();
        bbp.sleep();
        bbp.speak();//接口
        System.out.println("------");
        PingPangCoach ppc = new PingPangCoach();
        ppc.name = "刘胖子";
        ppc.age = 40;
        ppc.gender = "男";
        ppc.teach();
        ppc.sleep();

    }
}

class Person{
    String name;
    int age;
    String gender;
//    无参构造
    public Person(){}

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
//    成员方法
    public void eat(){
        System.out.println("吃饭");
    }
    public void sleep(){
        System.out.println("睡觉");
    }
}

//运动员抽象类

abstract class Player extends Person{
    public abstract void study();
}

//教练抽象类

abstract class Coach extends Person{
    public abstract void teach();
}

//子类
//篮球运动员
class BasketBallPlayer extends Player implements LearnEnglish {

    @Override
    public void study() {
        System.out.println("学投篮");
    }

    @Override
    public void speak() {
        System.out.println("说英语");
    }
}
//篮球教练
class BasketBallCoach extends Coach implements LearnEnglish{

    @Override
    public void teach() {
        System.out.println("教投篮");
    }

    @Override
    public void speak() {
        System.out.println("说英语");
    }
}
//乒乓球运动员
class PingPangPlayer extends Player {

    @Override
    public void study() {
        System.out.println("学抽球");
    }
}
//乒乓球教练
class PingPangCoach extends Coach {

    @Override
    public void teach() {
        System.out.println("教抽球");
    }
}

//接口 学习英语
interface LearnEnglish{
    public abstract void speak();
}