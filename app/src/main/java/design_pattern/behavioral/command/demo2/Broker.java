package design_pattern.behavioral.command.demo2;

import java.util.ArrayList;
import java.util.List;

/**
 * Create command invoker class.
 * 命令调用者类：股票经纪人
 */

public class Broker {
    private List<Order> orderList = new ArrayList<Order>();

    public void takeOrder(Order order) {
        orderList.add(order);
    }

    public void plackOrders() {
        for (Order o : orderList) {
            o.execute();
        }
        orderList.clear();
    }
}
