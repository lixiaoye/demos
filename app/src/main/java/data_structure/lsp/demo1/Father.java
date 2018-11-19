package data_structure.lsp.demo1;

import java.util.Collection;
import java.util.HashMap;

/**
 * Created by LIXIAOYE on 2018/11/1.
 * 放大输入参数类型
 */

public class Father {
    public Collection doSomething(HashMap hashMap) {
        System.out.println("父类doSomething...");
        return hashMap.values();
    }
}
