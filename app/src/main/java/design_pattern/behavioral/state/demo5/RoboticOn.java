package design_pattern.behavioral.state.demo5;

/**
 * Created by LIXIAOYE on 2018/12/24.
 */

public class RoboticOn implements RoboticState {
    private final Robot robot;

    public RoboticOn(Robot robot) {
        this.robot = robot;
    }

    @Override
    public void walk() {
        System.out.println("Walking...");
    }

    @Override
    public void cook() {
        System.out.println("Cooking...");
    }

    @Override
    public void off() {
//        robot.setRoboticState(robot.getRoboticOff());
        System.out.println("");
    }
}
