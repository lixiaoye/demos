package design_pattern.behavioral.command.demo9;

/**
 * 具体命令类：修改命令类
 */

public class ModifyCommand extends Command {
    public ModifyCommand(String name) {
        super(name);
    }

    @Override
    public void execute(String args) {
        this.args = args;
        configOperator.modify(args);
    }

    @Override
    public void execute() {
        configOperator.modify(this.args);
    }
}
