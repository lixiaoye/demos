package design_pattern.behavioral.command.demo5;


/**
 * Created by LIXIAOYE on 2018/11/21.
 */

public class FileInvoker {
    private Command command;

    public FileInvoker(Command command) {
        this.command = command;
    }

    public void execute() {
        this.command.execute();
    }
}
