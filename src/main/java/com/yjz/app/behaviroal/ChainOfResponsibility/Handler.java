package com.yjz.app.behaviroal.ChainOfResponsibility;

/**
 * Created by jasyu on 2019/3/20.
 **/
public abstract class Handler {
    protected Handler handler;

    public abstract boolean approve(double day);

    public Handler getHandler() {
        return handler;
    }

    public void setHandler(Handler handler) {
        this.handler = handler;
    }
}
