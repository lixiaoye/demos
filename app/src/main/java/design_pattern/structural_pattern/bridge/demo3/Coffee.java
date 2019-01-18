package design_pattern.structural_pattern.bridge.demo3;

/**
 * Created by LIXIAOYE on 2019/1/15.
 */

public abstract class Coffee {
    protected CoffeeAdditives impl;//持有对CoffeeAdditives的引用，以便调用具体的实现

    public Coffee(CoffeeAdditives impl) {
        this.impl = impl;
    }

    /**
     * 咖啡具体是什么样的由子类决定
     */
    public abstract void makeCoffee();
}
