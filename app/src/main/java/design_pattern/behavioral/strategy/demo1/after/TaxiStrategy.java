package design_pattern.behavioral.strategy.demo1.after;

/**
 * Created by LIXIAOYE on 2018/12/24.
 */

public class TaxiStrategy implements CalculateStrategy {
    /**
     * 简单计算为每公里2元
     *
     * @param km
     * @return
     */
    @Override
    public int calculatePrice(int km) {
        return 2 * km;
    }
}
