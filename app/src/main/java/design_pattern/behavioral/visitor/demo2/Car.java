package design_pattern.behavioral.visitor.demo2;

/**
 * Created by LIXIAOYE on 2018/12/26.
 */

public class Car {
    private Engine engine = new Engine();
    private Body body = new Body();
    private Wheel[] wheels = {
            new Wheel("front left"), new Wheel("front right"),
            new Wheel("back left"), new Wheel("back right")
    };

    public void accept(Visitor visitor) {
        visitor.visit(this);
        engine.accept(visitor);
        body.accept(visitor);
        for (int i = 0; i < wheels.length; i++) {
            wheels[i].accept(visitor);
        }
    }
}
