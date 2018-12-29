package design_pattern.behavioral.visitor.demo1;

import java.util.Random;

/**
 * Created by LIXIAOYE on 2018/12/26.
 */
//员工基类
public abstract class Staff {
    public String name;
    public int kpi;
    public Staff(String name){
        this.name=name;
        kpi=new Random().nextInt(10);
    }
    //接受Visitor的访问
    public abstract void accept(Visitor visitor);
}
