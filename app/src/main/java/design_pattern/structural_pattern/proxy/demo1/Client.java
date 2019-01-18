package design_pattern.structural_pattern.proxy.demo1;

/**
 * 客户类
 */
public class Client {
    public static void main(String[] args) {
        //构造一个真实主题对象
        RealSubject real = new RealSubject();
        //通过真实主题对象构造一个代理对象
        ProxySubject proxy = new ProxySubject(real);
        //调用代理的相关方法
        proxy.visit();
    }
}
