package design_pattern.structural_pattern.decorator.demo2;

/**
 * Created by LIXIAOYE on 2019/1/14.
 */

public class RedShapeDecorator extends ShapeDecorator{

    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        super.draw();
        setRedBorder(decoratedShape);
    }

    public void setRedBorder(Shape redBorder) {
        System.out.println("Border Color:Red setRedBorder()");
    }
}
