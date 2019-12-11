package com.yjz.app.behaviroal.ChainOfResponsibility;

/**
 * Created by jasyu on 2019/3/20.
 * <p>
 * 优点： 1、降低耦合度。它将请求的发送者和接收者解耦。
 * 2、简化了对象。使得对象不需要知道链的结构。
 * 3、增强给对象指派职责的灵活性。通过改变链内的成员或者调动它们的次序，允许动态地新增或者删除责任。
 * 4、增加新的请求处理类很方便。
 * <p>
 * 缺点： 1、不能保证请求一定被接收。
 * 2、系统性能将受到一定影响，而且在进行代码调试时不太方便，可能会造成循环调用。
 * 3、可能不容易观察运行时的特征，有碍于除错。
 **/
public class Client {
    public static void main(String[] args) {
        GroupLeader gl = new GroupLeader();
        ProjectManager pm = new ProjectManager();
        DepartmentManager dm = new DepartmentManager();
        CEO ceo = new CEO();

        gl.setHandler(pm);
        pm.setHandler(dm);
        dm.setHandler(ceo);

        gl.approve(4D);
        System.out.println("-----------------------");
        gl.approve(1D);
        System.out.println("-----------------------");
        gl.approve(6D);
    }
}
