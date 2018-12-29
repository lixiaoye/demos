package design_pattern.behavioral.template.demo5;

/**
 * Created by LIXIAOYE on 2018/12/25.
 */
//活期账户类，充当具体子类
public class CurrentAccount extends Account{
    @Override
    public void calculateInterest() {
        System.out.println("按活期利率计算利息！");
    }
}
