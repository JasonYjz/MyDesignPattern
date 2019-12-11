package main.java.com.yjz.app.creational.Singleton;

/**
 * Created by jasyu on 2019/12/10.
 * 基础的单例模式，线程非安全的实现方式
 **/
public class SingletonWithoutThreadSafe {
    private static SingletonWithoutThreadSafe instance;
    private SingletonWithoutThreadSafe() {}

    public static SingletonWithoutThreadSafe getInstance() {
        if (instance == null) {
            instance = new SingletonWithoutThreadSafe();
        }

        return instance;
    }
}
