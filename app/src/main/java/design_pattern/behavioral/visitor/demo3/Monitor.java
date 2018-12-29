package design_pattern.behavioral.visitor.demo3;

/**
 * Created by LIXIAOYE on 2018/12/26.
 */

public class Monitor implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
