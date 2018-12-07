package design_pattern.behavioral.command.demo6;

/**
 * 最小化命令类：具体命令类
 */

public class MinimizeCommand extends Command {
    private WindowHandler windowHandler;//维持对请求接收者的引用

    public MinimizeCommand() {
        windowHandler = new WindowHandler();
    }

    //命令执行方法，将调用请求接收者的业务方法
    @Override
    public void execute() {
        windowHandler.minimize();
    }
}
