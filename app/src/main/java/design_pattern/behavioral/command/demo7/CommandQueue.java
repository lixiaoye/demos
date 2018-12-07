package design_pattern.behavioral.command.demo7;

import java.util.ArrayList;

import design_pattern.behavioral.command.demo1.Command;

/**
 * 命令队列
 */

public class CommandQueue {
    //定义一个ArrayList来存储命令队列
    private ArrayList<Command> commands = new ArrayList<Command>();

    public void addCommand(Command command) {
        commands.add(command);
    }

    public void removeCommand(Command command) {
        commands.remove(command);
    }

    //循环调用每一个命令对象的execute()方法
    public void execute() {
        for (Object command : commands) {
            ((Command) command).execute();
        }
    }
}
