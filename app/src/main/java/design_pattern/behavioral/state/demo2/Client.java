package design_pattern.behavioral.state.demo2;

/**
 * Created by LIXIAOYE on 2018/11/30.
 */

public class Client {
    public static void main(String[] args) {
        Account account = new Account("段誉", 0.0);
        account.deposit(1000);
        account.withdraw(2000);
        account.deposit(3000);
        account.withdraw(4000);
        account.withdraw(1000);
        account.computeInterest();
    }
}
