package com.yjz.app.behaviroal.ChainOfResponsibility;

/**
 * Created by jasyu on 2019/3/20.
 **/
public class CEO extends Handler {
    @Override
    public boolean approve(double day) {
        System.out.println("CEO审批通过");
        return true;
    }
}
