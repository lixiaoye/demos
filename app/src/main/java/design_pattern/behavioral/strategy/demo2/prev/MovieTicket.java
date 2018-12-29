package design_pattern.behavioral.strategy.demo2.prev;

/**
 * 电影票类
 */

public class MovieTicket {
    private double price;//电影票价格
    private String type;//电影票类型

    public void setPrice(double price) {
        this.price = price;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return this.calculate();
    }

    public String getType() {
        return this.type;
    }

    /**
     * 计算打折后的票价
     */
    public double calculate() {
        //学生票打折
        if (this.type.equalsIgnoreCase("student")) {
            System.out.println("学生票：");
            return this.price * 0.8;
        } else if (this.type.equalsIgnoreCase("children") && this.price >= 20) {
            System.out.println("儿童票");
            return this.price - 10;
        } else if (this.type.equalsIgnoreCase("vip")) {
            System.out.println("VIP票，增加积分！");
            return this.price * 0.5;
        }else{
            return this.price;//不满足打折条件则按照原价
        }
    }
}
