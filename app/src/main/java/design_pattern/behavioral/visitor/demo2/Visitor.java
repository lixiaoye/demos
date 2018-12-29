package design_pattern.behavioral.visitor.demo2;

/**
 * Created by LIXIAOYE on 2018/12/26.
 */

public interface Visitor {
    public void visit(Wheel wheel);

    void visit(Engine engine);

    void visit(Body body);

    void visit(Car car);
}
