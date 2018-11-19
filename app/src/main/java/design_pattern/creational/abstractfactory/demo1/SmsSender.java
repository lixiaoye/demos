package design_pattern.creational.abstractfactory.demo1;

/**
 * Created by LIXIAOYE on 2018/11/6.
 */

public class SmsSender implements Sender {
    @Override
    public void send() {
        System.out.println("smssender send ...");
    }
}
