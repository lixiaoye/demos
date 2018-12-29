package design_pattern.behavioral.template.demo5;

/**
 * Created by LIXIAOYE on 2018/12/25.
 */
//定期账户，充当具体子类
public class DepositAccount extends Account{
    @Override
    public void calculateInterest() {
        System.out.println("按定期利率计算利息！");
    }
}
