package design_pattern.behavioral.visitor.demo4;

/**
 * Created by LIXIAOYE on 2018/12/26.
 */
//部门类：抽象访问者类
public abstract class Department {
    //声明一组重载的访问方法，用于访问不同类型的具体元素
    public abstract void visit(FulltimeEmployee employee);

    public abstract void visit(ParttimeEmployee employee);
}
