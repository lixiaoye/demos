package design_pattern.behavioral.command.demo8;

/**
 * 抽象命令类
 */

public abstract class AbstractCommand {
    public abstract int execute(int value);//声明命令执行方法execute()

    public abstract int undo();//声明撤销方法undo()
}
