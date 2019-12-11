package com.yjz.app.behaviroal.ChainOfResponsibility;

/**
 * Created by jasyu on 2019/3/20.
 **/
public class GroupLeader extends Handler {
    @Override
    public boolean approve(double day) {
        if (day < 0.5) {
            System.out.println("组长审批通过");
            return true;
        } else {
            System.out.println("超过0.5天无权审批，组长传给了上司");
            return getHandler().approve(day);
        }
    }
}
