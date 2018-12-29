package design_pattern.behavioral.template.demo5;

/**
 * Created by LIXIAOYE on 2018/12/25.
 */

public class Client {
    public static void main(String[] args) {
        Account account;
        //读取配置文件
        account = (Account) XMLUtil.getBean();
        account.handle("russell", "123abc");
/**
 * 打印结果：
 按活期利率计算利息！
 显示利息
 */
    }
}
