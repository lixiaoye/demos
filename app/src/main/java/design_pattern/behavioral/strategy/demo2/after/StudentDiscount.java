package design_pattern.behavioral.strategy.demo2.after;

/**
 * 学生票折扣类：具体策略类
 */

public class StudentDiscount implements Discount {
    @Override
    public double calculate(double price) {
        return price * 0.8;
    }
}
