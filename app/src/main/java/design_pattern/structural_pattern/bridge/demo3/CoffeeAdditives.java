package design_pattern.structural_pattern.bridge.demo3;

/**
 * Created by LIXIAOYE on 2019/1/15.
 */
public abstract class CoffeeAdditives {
    /**
     * 具体要往咖啡里添加什么也是由子类实现
     * @return 具体添加的东西
     */
    public abstract String addSomething();
}
