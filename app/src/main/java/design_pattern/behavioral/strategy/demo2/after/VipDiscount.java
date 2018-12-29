package design_pattern.behavioral.strategy.demo2.after;

/**
 * VIP会员票折扣类：具体策略类
 */

public class VipDiscount implements Discount {
    @Override
    public double calculate(double price) {
        return price * 0.5;
    }
}
