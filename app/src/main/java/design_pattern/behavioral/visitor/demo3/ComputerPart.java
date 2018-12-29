package design_pattern.behavioral.visitor.demo3;

/**
 * Created by LIXIAOYE on 2018/12/26.
 */

public interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
}
