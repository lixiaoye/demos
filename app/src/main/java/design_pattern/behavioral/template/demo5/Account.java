package design_pattern.behavioral.template.demo5;

/**
 * Created by LIXIAOYE on 2018/12/25.
 */

public abstract class Account {
    public boolean validate(String account, String password) {
        if (account.equals("russell") && password.equals("123abc")) {
            return true;
        } else {
            return false;
        }
    }

    //基本方法-抽象方法
    public abstract void calculateInterest();

    //基本方法-具体方法
    public void display() {
        System.out.println("显示利息");
    }

    //模板方法
    public void handle(String account, String password) {
        if (!validate(account, password)) {
            System.out.println("账户或密码错误！");
            return;
        }
        calculateInterest();
        display();
    }

}















