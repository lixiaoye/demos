package design_pattern.creational.abstractfactory.demo1;

/**
 * Created by LIXIAOYE on 2018/11/6.
 */

public class Test {
    public static void main(String[] args) {
        Provider provider = new SendMailFactory();
        Sender sender = provider.produce();
        sender.send();//mailsender send...
    }
}
