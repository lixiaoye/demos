package design_pattern.structural_pattern.facade.demo2;


/**
 * Created by LIXIAOYE on 2019/1/14.
 */

public class FacadePatternDemo {
    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}
