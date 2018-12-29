package design_pattern.structural_pattern.flyweight.demo1;

import java.net.PortUnreachableException;
import java.util.Random;

/**
 * Created by LIXIAOYE on 2018/12/26.
 */

public class TrainTicket implements Ticket {
    public String from;//始发地
    public String to;//目的地
    public String bunk;//铺位
    public int price;

    public TrainTicket(String from, String to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public void showTicketInfo(String bunk) {
        price = new Random().nextInt(300);
        System.out.println("购买从 " + from + " 到 " + to + "的 " + bunk + " 火车票" + ",价格：" + price);
    }
}
