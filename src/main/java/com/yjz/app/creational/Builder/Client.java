package com.yjz.app.creational.Builder;

/**
 * Created by jasyu on 2019/3/25.
 **/
public class Client {
    public static void main(String[] args) {
        //创建具体建造者对象
        ICar car = new Audi();
        //创造导演者角色，给定建造者对象
        Director director = new Director(car);
        //调用导演者角色，创建产品零件
        director.constructCar();

        //接收建造者角色产品建造结果
        Car instance = car.retrieveResult();
        System.out.println(instance.toString());
    }
}
