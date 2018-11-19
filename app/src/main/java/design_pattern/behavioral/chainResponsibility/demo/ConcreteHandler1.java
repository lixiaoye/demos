package design_pattern.behavioral.chainResponsibility.demo;

/**
 * 具体处理者1
 */

public class ConcreteHandler1 extends Handler {
    @Override
    public void handleRequest(String condition) {
        if (condition.equals("ConcreteHandler1")) {
            //请求满足条件，则处理请求
            System.out.println("ConcreteHandler1 handled");
            return;
        } else {
            //转发请求
            successor.handleRequest(condition);
        }
    }
}
