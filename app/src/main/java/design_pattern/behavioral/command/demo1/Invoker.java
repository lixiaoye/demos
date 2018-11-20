package design_pattern.behavioral.command.demo1;

/**
 * 请求者类
 */

public class Invoker {
    private Command command;//持有一个对相应命令对象的引用

    //构造注入
    public Invoker(Command command) {
        this.command = command;
    }

    public void action() {
        //调用具体命令对象的相关方法，执行具体命令
        command.execute();
    }
}
