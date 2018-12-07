package design_pattern.behavioral.command.demo8;

/**
 * 客户端测试代码
 */

public class Client {
    public static void main(String[] args) {
        CalculatorForm form = new CalculatorForm();
        AbstractCommand command;
        command = new ConcreteCommand();
        form.setCommand(command);//向发送者注入命令对象
        form.compute(10);
        form.compute(5);
        form.compute(10);
        form.undo();
    }
}
