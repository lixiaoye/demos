package design_pattern.behavioral.command.demo3;

/**
 * 实现功能键与功能处理类之间的调用关系
 */

public class FunctionButton {
    private HelpHandler help;//HelpHandler：帮助文档处理类，请求接收者

    //在FunctionButton的onClick()方法中调用HelpHandler的display()方法
    public void onClick() {
        help = new HelpHandler();
        help.display();//显示帮助文档
    }
}
