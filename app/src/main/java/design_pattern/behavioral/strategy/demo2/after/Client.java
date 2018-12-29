package design_pattern.behavioral.strategy.demo2.after;

/**
 * Created by LIXIAOYE on 2018/12/24.
 */

public class Client {
    public static void main(String[] args) {
        MovieTicket movieTicket = new MovieTicket();
        double originalPrice = 60.0;
        double currentPrice;
        movieTicket.setPrice(originalPrice);
        System.out.println("原始价为：" + originalPrice);
        System.out.println("--------------------------");

        Discount discount;
        discount = (Discount) XMLUtil.getBean();//读取配置文件并反射生成具体折扣对象
        movieTicket.setDiscount(discount);//注入折扣对象

        currentPrice = movieTicket.getPrice();
        System.out.println("折后价：" + currentPrice);
    }
}
