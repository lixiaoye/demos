package design_pattern.behavioral.command.demo1;

/**
 * 接收者类
 */

public class Receiver {
    /**
     * 真正执行具体命令逻辑的方法
     */
    public void action() {
        System.out.println("执行具体操作");
    }
}
