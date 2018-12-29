package design_pattern.behavioral.strategy.demo1.prev;


/**
 * Created by LIXIAOYE on 2018/12/24.
 */

public class PriceCalculator {
    // 公交车类型
    private static final int BUS = 1;
    //地铁类型
    private static final int SUBWAY = 2;
    //出租车类型
    private static final int TAXI = 3;

    /**
     * 简单计算为每公里2元
     *
     * @param km
     * @return
     */
    private int taxiPrice(int km) {
        return km * 2;
    }

    public int calculatePrice(int km, int type) {
        if (type == BUS) {
            return busPrice(km);
        } else if (type == SUBWAY) {
            return subwayPrice(km);
        } else if (type == TAXI) {
            return taxiPrice(km);
        }
        return 0;
    }

    public static void main(String[] args) {
        PriceCalculator calculator = new PriceCalculator();
        System.out.println("乘坐16公里的公交车票价为：" + calculator.calculatePrice(16, BUS));
        System.out.println("乘坐16公里的地铁票价为：" + calculator.calculatePrice(16, SUBWAY));
    }


    /**
     * 北京公交车，十公里之内一元钱，超过十公里之后每加一元钱可以乘5公里
     *
     * @param km 公里
     * @return
     */
    private int subwayPrice(int km) {
        //超过十公里的总距离
        int extraTotal = km - 10;
        //超过的距离是5公里的倍数
        int extraFactor = extraTotal / 5;
        //超过的距离对5公里取余
        int fraction = extraTotal % 5;
        //价格计算
        int price = 1 + extraFactor * 1;
        return fraction > 0 ? ++price : price;
    }

    /**
     * 6公里（含）内3元；6~12公里（含）4元；12~22公里（含）5元；22~32公里（含）6元;
     *
     * @param km 公里
     * @return
     */
    private int busPrice(int km) {
        if (km <= 6) {
            return 3;
        } else if (km > 6 && km <= 12) {
            return 4;
        } else if (km > 12 && km <= 22) {
            return 5;
        } else if (km > 22 && km < 32) {
            return 6;
        }
        //其他距离我们简化为7元
        return 7;
    }
}
