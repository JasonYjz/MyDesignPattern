package com.yjz.app.behaviroal.ChainOfResponsibility;

/**
 * Created by jasyu on 2019/3/20.
 **/
public class DepartmentManager extends Handler {
    @Override
    public boolean approve(double day) {
        if (day < 5) {
            System.out.println("部门经理审批通过");
            return true;
        } else {
            System.out.println("超过5天无权审批，部门经理传给了他的上司");
            return getHandler().approve(day);
        }
    }
}
