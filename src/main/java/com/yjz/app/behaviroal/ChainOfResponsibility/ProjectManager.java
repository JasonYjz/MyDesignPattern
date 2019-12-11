package com.yjz.app.behaviroal.ChainOfResponsibility;

/**
 * Created by jasyu on 2019/3/20.
 **/
public class ProjectManager extends Handler {
    @Override
    public boolean approve(double day) {
        if (day < 2) {
            System.out.println("项目经理审批通过");
            return true;
        } else {
            System.out.println("超过2天无权审批，项目经理传给了上司");
            return getHandler().approve(day);
        }
    }
}
