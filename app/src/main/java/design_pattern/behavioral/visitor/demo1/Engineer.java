package design_pattern.behavioral.visitor.demo1;

import java.util.Random;

/**
 * Created by LIXIAOYE on 2018/12/26.
 */
//工程师
public class Engineer extends Staff {
    public Engineer(String name) {
        super(name);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    //工程师这一年写的代码数量
    public int getCodeLines() {
        return new Random().nextInt(10 * 10000);
    }
}
