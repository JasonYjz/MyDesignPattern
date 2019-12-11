package com.yjz.app.creational.Builder;

/**
 * Created by jasyu on 2019/3/25.
 **/
public class Director {
    private ICar car;

    public Director(ICar car) {
        this.car = car;
    }

    public void constructCar() {
        car.buildFaDongJi();
        car.buildJiJia();
        car.buildLunZi();
        car.buildLogo();
    }
}
