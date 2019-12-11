package com.yjz.app.creational.Builder;

/**
 * Created by jasyu on 2019/3/22.
 **/
public interface ICar {
    void buildJiJia();

    void buildFaDongJi();

    void buildLogo();

    void buildLunZi();

    Car retrieveResult();
}
