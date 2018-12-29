package design_pattern.behavioral.template.demo3;

/**
 * Created by LIXIAOYE on 2018/12/25.
 */

public class GlassHouse extends HouseTemplate {
    @Override
    public void buildWalls() {
        System.out.println("Building Glass Walls");
    }

    @Override
    public void buildPillars() {
        System.out.println("Building Pillars with glass coating");
    }
}
