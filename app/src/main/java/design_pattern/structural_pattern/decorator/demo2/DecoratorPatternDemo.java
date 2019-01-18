package design_pattern.structural_pattern.decorator.demo2;

/**
 * Created by LIXIAOYE on 2019/1/14.
 */

public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape redCircle = new RedShapeDecorator(new Circle());
        Shape redRectangle = new RedShapeDecorator(new Rectangle());

        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("Circle with red border");
        redCircle.draw();
        System.out.println("Rectangle with red border");
        redRectangle.draw();
    }
    /**
     Circle with normal border
     Shape :Circle draw()
     Circle with red border
     Shape :Circle draw()
     Border Color:Red setRedBorder()
     Rectangle with red border
     Shape:Rectangle draw()
     Border Color:Red setRedBorder()
     */
}
