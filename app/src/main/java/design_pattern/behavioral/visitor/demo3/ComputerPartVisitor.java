package design_pattern.behavioral.visitor.demo3;

/**
 * Created by LIXIAOYE on 2018/12/26.
 */

public interface ComputerPartVisitor {
    public void visit(Computer computer);

    public void visit(Mouse mouse);

    public void visit(Keyboard keyboard);

    public void visit(Monitor monitor);
}
