package design_pattern.behavioral.template.demo3;

/**
 * Created by LIXIAOYE on 2018/12/25.
 */

public abstract class HouseTemplate {
    //template method,final so subclasses can't override
    public final void buildHouse() {
        buildFoundations();
        buildPillars();
        buildWalls();
        buildWindows();
        System.out.println("House is built.");
    }

    //default implementation
    private void buildWindows() {
        System.out.println("Building Glass Windows");
    }

    //methods to be implemented by subclasses
    public abstract void buildWalls();

    public abstract void buildPillars();

    private void buildFoundations() {
        System.out.println("Building foundations with cement,iron rods and sand");
    }

}















