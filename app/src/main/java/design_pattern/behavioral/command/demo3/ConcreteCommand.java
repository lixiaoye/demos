package design_pattern.behavioral.command.demo3;

import design_pattern.behavioral.command.demo1.Receiver;

/**
 * 具体命令类：继承了抽象命令类，它与请求接收者相关联，
 * 实现了在抽象命令类中声明的execute()方法，并在实现时调用接收者的请求响应方法action().
 */

public class ConcreteCommand extends Command {
    private Receiver receiver;//维持一个对请求接收者对象的引用

    @Override
    public void execute() {
        receiver.action();//调用请求接收者的业务处理方法action()
    }
}
