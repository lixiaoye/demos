package design_pattern.behavioral.observer.demo1;

/**
 * 测试代码
 */

public class Test {
    public static void main(String[] args) {
        //被观察的角色
        DevTechFrontier devTechFrontier = new DevTechFrontier();
        //观察者
        Coder mrsimple = new Coder("mr.simple");
        Coder coder1 = new Coder("coder-1");
        Coder coder2 = new Coder("coder-2");
        Coder coder3 = new Coder("coder-3");

        //将观察者注册到可观察对象的观察者列表中
        devTechFrontier.addObserver(mrsimple);
        devTechFrontier.addObserver(coder1);
        devTechFrontier.addObserver(coder2);
        devTechFrontier.addObserver(coder3);

        //发布消息
        devTechFrontier.postNewPublication("新的一期开发技术前线周报发布啦！");
    }
}
