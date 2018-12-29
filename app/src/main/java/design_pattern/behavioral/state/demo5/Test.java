package design_pattern.behavioral.state.demo5;

/**
 * Created by LIXIAOYE on 2018/12/24.
 */

public class Test {
    public static void main(String[] args) {
        Robot robot = new Robot();
        robot.walk();
        robot.cook();
        robot.walk();
        robot.off();

        robot.walk();
        robot.off();
        robot.cook();



    }
}
