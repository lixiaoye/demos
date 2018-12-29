package design_pattern.behavioral.visitor.demo3;

/**
 * Created by LIXIAOYE on 2018/12/26.
 */

public class Client {
    public static void main(String[] args) {
        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartVisitorImpl());
    }
    /**
     * 打印结果：
     Displaying Mouse.
     Displaying keyboard.
     Displaying Monitor.
     Displaying Computer.
     */
}
