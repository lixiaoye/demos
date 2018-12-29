package design_pattern.behavioral.visitor.demo1;

import java.util.Random;

/**
 * Created by LIXIAOYE on 2018/12/26.
 */
//经理类
public class Manager extends Staff {
    private int products;//产品数量

    public Manager(String name) {
        super(name);
        products = new Random().nextInt(10);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    //一年内做的产品数量
    public int getProducts() {
        return products;
    }
}
