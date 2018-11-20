package design_pattern.behavioral.command.demo2;


/**
 * Create a request class.
 * 请求者类：股票类
 */

public class Stock {
    private String name = "03888";//股票代码
    private int quantity = 1000;//股数，1手

    public void buy() {
        System.out.println("Stock [name:" + name + ",Quantity:" + quantity + "] bought");
    }

    public void sell() {
        System.out.println("Stock [name:" + name + ",Quantity:" + quantity + "] sold");
    }
}
