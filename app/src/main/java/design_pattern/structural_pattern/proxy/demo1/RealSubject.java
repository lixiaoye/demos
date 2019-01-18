package design_pattern.structural_pattern.proxy.demo1;

/**
 * 实现抽象主题的真实主题类
 */
public class RealSubject extends Subject {
    @Override
    public void visit() {
        //RealSubject中visit的具体逻辑
        System.out.println("Real subject!");
    }
}
