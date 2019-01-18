package design_pattern.structural_pattern.decorator.demo2;

/**
 * Created by LIXIAOYE on 2019/1/14.
 */

public abstract class ShapeDecorator implements Shape {
    protected Shape decoratedShape;
    public ShapeDecorator(Shape decoratedShape){
        this.decoratedShape=decoratedShape;
    }

    @Override
    public void draw() {
        decoratedShape.draw();
    }
}
