package design_pattern.behavioral.visitor.demo2;

/**
 * Created by LIXIAOYE on 2018/12/26.
 */

public class VisitorDemo {
    public static void main(String[] args) {
        Car car = new Car();
        Visitor visitor = new PrintVisitor();
        car.accept(visitor);
    }
    /**
     * 打印结果：
     Visiting car
     Visiting engine
     Visiting body
     Visiting front left wheel
     Visiting front right wheel
     Visiting back left wheel
     Visiting back right wheel
     */
}
