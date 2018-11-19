package design_pattern.behavioral.chainResponsibility.demo;

/**
 * 具体处理者2
 */

public class ConcreteHandler2 extends Handler {
    @Override
    public void handleRequest(String condition) {
        if (condition.equals("ConcreteHandler2")) {
            //请求满足条件，则处理请求
            System.out.println("ConcreteHandler2 handled");
            return;
        } else {
            //转发请求
            successor.handleRequest(condition);
        }
    }
}
