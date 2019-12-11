package com.yjz.app.creational.Builder;

/**
 * Created by jasyu on 2019/3/25.
 **/
public class Audi implements ICar {
    private Car audiCar = new Car();

    public void buildJiJia() {
        audiCar.setJiJia("高强度钢结构机架。");
    }

    public void buildFaDongJi() {
        audiCar.setFaDongJi("500马力的发动机。");
    }

    public void buildLogo() {
        audiCar.setLogo("4个圈的LOGO。");
    }

    public void buildLunZi() {
        audiCar.setLunZi("耐磨的普斯林轮胎。");
    }

    public Car retrieveResult() {
        return audiCar;
    }
}
