package com.yjz.app.creational.Builder;

/**
 * Created by jasyu on 2019/3/25.
 **/
public class Car {
    private String Logo;
    private String JiJia;
    private String FaDongJi;
    private String LunZi;

    public String getLogo() {
        return Logo;
    }

    public void setLogo(String logo) {
        Logo = logo;
    }

    public String getJiJia() {
        return JiJia;
    }

    public void setJiJia(String jiJia) {
        JiJia = jiJia;
    }

    public String getFaDongJi() {
        return FaDongJi;
    }

    public void setFaDongJi(String faDongJi) {
        FaDongJi = faDongJi;
    }

    public String getLunZi() {
        return LunZi;
    }

    public void setLunZi(String lunZi) {
        LunZi = lunZi;
    }

    @Override
    public String toString() {
        return "Car{" +
                "Logo='" + Logo + '\'' +
                ", JiJia='" + JiJia + '\'' +
                ", FaDongJi='" + FaDongJi + '\'' +
                ", LunZi='" + LunZi + '\'' +
                '}';
    }
}
