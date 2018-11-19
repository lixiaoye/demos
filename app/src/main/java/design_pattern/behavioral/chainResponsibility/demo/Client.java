package design_pattern.behavioral.chainResponsibility.demo;

/**
 * 客户类
 */

public class Client {
    public static void main(String[] args) {
        //构造一个ConcreteHandler1对象
        ConcreteHandler1 handler1 = new ConcreteHandler1();
        //构造一个ConcreteHandler2对象
        ConcreteHandler2 handler2 = new ConcreteHandler2();
        //设置handler1的下一个节点
//        handler1.successor = handler2;
        handler1.setSuccessor(handler2);
        //设置handler2的下一个节点
//        handler2.successor = handler1;
        handler2.setSuccessor(handler1);
        //处理请求
        handler1.handleRequest("ConcreteHandler2");//ConcreteHandler2 handled
    }
}
