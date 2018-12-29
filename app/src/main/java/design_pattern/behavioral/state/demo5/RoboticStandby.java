package design_pattern.behavioral.state.demo5;

/**
 * Created by LIXIAOYE on 2018/12/24.
 */

public class RoboticStandby implements RoboticState {
    private Robot robot;

    public RoboticStandby(Robot robot) {
        this.robot = robot;
    }

    @Override
    public void walk() {
        System.out.println("In standy state...");
        robot.setState(robot.getRoboticOn());
        System.out.println("Walking...");
    }

    @Override
    public void cook() {
        System.out.println("In standby state...");
        robot.setState(robot.getRoboticCook());
        System.out.println("Cooking...");
    }

    @Override
    public void off() {
        System.out.println("In standby state...");
        robot.setState(robot.getRoboticOff());
        System.out.println("Robot is switched off");
    }
}
