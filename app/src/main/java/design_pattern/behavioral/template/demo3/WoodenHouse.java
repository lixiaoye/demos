package design_pattern.behavioral.template.demo3;

/**
 * Created by LIXIAOYE on 2018/12/25.
 */

public class WoodenHouse extends HouseTemplate {
    @Override
    public void buildWalls() {
        System.out.println("Building Wooden Walls");
    }

    @Override
    public void buildPillars() {
        System.out.println("Building Pillars with Wood coating");
    }
}
