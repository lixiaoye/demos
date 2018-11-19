package data_structure.lsp.demo2;

import java.util.Collection;
import java.util.HashMap;

/**
 * 子类的前置条件较小
 */

public class Son extends Father {
    public Collection doSomething(HashMap hashMap) {
        System.out.println("子类doSomething...");
        return hashMap.values();
    }

}
