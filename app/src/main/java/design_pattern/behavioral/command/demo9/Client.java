package design_pattern.behavioral.command.demo9;

/**
 * 客户端测试代码
 */

public class Client {
    public static void main(String[] args) {
        ConfigSettingWindow csw = new ConfigSettingWindow();//定义请求发送者
        Command command;//定义命令对象
        ConfigOperator configOperator = new ConfigOperator();//定义请求接收者
        command = new InsertCommand("增加");
        command.setConfigOperator(configOperator);
        csw.setCommand(command);
        command = new InsertCommand("增加");
        command.setConfigOperator(configOperator);
        csw.setCommand(command);
        csw.call("网站首页");

        command = new InsertCommand("增加");
        command.setConfigOperator(configOperator);
        csw.setCommand(command);
        csw.call("端口号");

        command = new ModifyCommand("修改");
        command.setConfigOperator(configOperator);
        csw.setCommand(command);
        csw.call("网站首页");

        command = new ModifyCommand("修改");
        command.setConfigOperator(configOperator);
        csw.setCommand(command);
        csw.call("端口号");

        System.out.println("----------------------------");
        System.out.println("保存配置");
        csw.save();

        System.out.println("----------------------------");
        System.out.println("恢复配置");
        System.out.println("----------------------------");
        csw.recover();

    }
}
