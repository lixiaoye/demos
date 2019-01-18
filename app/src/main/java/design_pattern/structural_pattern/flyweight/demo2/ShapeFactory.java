package design_pattern.structural_pattern.flyweight.demo2;

import java.util.HashMap;

/**
 * Create factory to generate object of concrete class based
 * on given information
 */

public class ShapeFactory {
    private static final HashMap circleMap = new HashMap();

    public static Shape getCircle(String color) {
        Circle circle = (Circle) circleMap.get(color);
        if (circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("Creating circle of color:" + color);
        }
        return circle;
    }
}
