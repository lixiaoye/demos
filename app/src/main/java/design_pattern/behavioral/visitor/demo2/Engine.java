package design_pattern.behavioral.visitor.demo2;

/**
 * Created by LIXIAOYE on 2018/12/26.
 */

public class Engine {
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
