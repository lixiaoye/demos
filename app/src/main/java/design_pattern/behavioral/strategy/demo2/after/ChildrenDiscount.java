package design_pattern.behavioral.strategy.demo2.after;

/**
 * 儿童票折扣类：具体策略类
 */

public class ChildrenDiscount implements Discount {
    @Override
    public double calculate(double price) {
        return price - 10;
    }
}
