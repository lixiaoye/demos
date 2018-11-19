package data_structure.lsp.demo1;

import java.util.Collection;
import java.util.Map;

/**
 * Created by LIXIAOYE on 2018/11/1.
 * 放大输入参数类型
 */

public class Son extends Father {
    //
    /**
    与父类方法名相同，但是不是覆写（Override）父类的方法。
     重载（Overload）:方法名相同，输入参数类型不同
     */
    public Collection doSomething(Map map) {
        System.out.println("子类doSomething...");
        return map.values();
    }
}
