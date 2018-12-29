package design_pattern.behavioral.visitor.demo4;

/**
 * Created by LIXIAOYE on 2018/12/26.
 */
//员工类：抽象元素类
public interface Employee {
    public void accept(Department handler);//接受一个抽象访问者访问
}
