package main.java.com.yjz.app.creational.Singleton;

/**
 * Created by jasyu on 2019/12/10.
 * 线程安全的单例模式实现方式
 **/
public class SingletonInThreadSafe {
    private static SingletonInThreadSafe instance;
    private SingletonInThreadSafe() {}
    public static synchronized SingletonInThreadSafe getInstance() {
        if (instance == null) {
            instance = new SingletonInThreadSafe();
        }

        return instance;
    }
}
