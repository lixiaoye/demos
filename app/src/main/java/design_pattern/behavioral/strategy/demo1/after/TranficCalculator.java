package design_pattern.behavioral.strategy.demo1.after;

/**
 * 公交出行价格计算器.
 */

public class TranficCalculator {
    CalculateStrategy mStrategy;

    public void setStrategy(CalculateStrategy calculateStrategy) {
        this.mStrategy = calculateStrategy;
    }

    public int calculatePrice(int km) {
        return mStrategy.calculatePrice(km);
    }

    public static void main(String[] args) {
        TranficCalculator calculator = new TranficCalculator();
        //设置计算策略
        calculator.setStrategy(new BusStrategy());
        //计算价格
        System.out.println("公交车乘16公里的价格：" + calculator.calculatePrice(16));//公交车乘16公里的价格：3

        //将策略注入到TranficCalculator中
        calculator.setStrategy(new TaxiStrategy());
        System.out.println("出租车乘16公里的价格是:" + calculator.calculatePrice(16));//出租车乘16公里的价格是:32
    }
}
