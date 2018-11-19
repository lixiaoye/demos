package data_structure.lsp.demo2;

import java.util.Collection;
import java.util.Map;

/**
 * 扩大父类的前置条件
 */

public class Father {
    public Collection doSomething(Map map) {
        System.out.println("父类doSomething...");
        return map.values();
    }
}
