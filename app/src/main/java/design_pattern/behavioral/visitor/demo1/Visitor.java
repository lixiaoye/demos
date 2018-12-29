package design_pattern.behavioral.visitor.demo1;


/**
 * Created by LIXIAOYE on 2018/12/26.
 */

public interface Visitor {
//访问工程师类型
    public void visit(Engineer engineer);
    //访问经理类型
    public void visit(Manager leader);
}
