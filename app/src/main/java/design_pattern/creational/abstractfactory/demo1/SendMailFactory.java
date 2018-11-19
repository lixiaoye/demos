package design_pattern.creational.abstractfactory.demo1;

/**
 * Created by LIXIAOYE on 2018/11/6.
 */

public class SendMailFactory implements Provider {
    @Override
    public Sender produce() {
        return new MailSender();
    }
}
