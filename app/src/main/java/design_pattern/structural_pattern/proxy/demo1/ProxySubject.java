package design_pattern.structural_pattern.proxy.demo1;

/**
 * 代理类
 */
public class ProxySubject extends Subject {
    private RealSubject mSubject;//持有真实主题的引用

    public ProxySubject(RealSubject subject) {
        this.mSubject = subject;
    }

    @Override
    public void visit() {
        //通过真实主题引用的对象调用真实主题中的逻辑方法
        mSubject.visit();
    }
}
