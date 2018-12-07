package design_pattern.behavioral.command.demo6;

/**
 * 客户端测试代码
 */

public class Client {
    public static void main(String[] args) {
        FBSettingWindow fbSettingWindow = new FBSettingWindow("功能键设置");
        FunctionButton fb1, fb2;
        fb1 = new FunctionButton("功能键1");
        fb2 = new FunctionButton("功能键2");
        Command command1, command2;
        //通过读取配置文件和反射生成具体命令对象
        command1 = (Command) XMLUtil.getBean(0);
        command2 = (Command) XMLUtil.getBean(1);
        //将命令对象注入功能键
        fb1.setCommand(command1);
        fb2.setCommand(command2);

        fbSettingWindow.addFunctionButton(fb1);
        fbSettingWindow.addFunctionButton(fb2);
        fbSettingWindow.display();
        //调用功能键的业务方法
        fb1.onClick();
        fb2.onClick();

    }
}
