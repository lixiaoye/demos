package data_structure.lsp.demo2;

import java.util.HashMap;

/**
 * Created by LIXIAOYE on 2018/11/1.
 */

public class Client {
    public static void main(String[] args) {
        invoker1();
        invoker2();
    }

    private static void invoker1() {
        Father father = new Father();
        HashMap hashMap = new HashMap();
        father.doSomething(hashMap);//父类doSomething...
    }

    private static void invoker2() {
        Son son = new Son();
        HashMap hashMap = new HashMap();
        son.doSomething(hashMap);//子类doSomething...
    }
    /**
     * 分析：
     * 子类在没有覆写父类的方法的前提下，子类方法被执行了，这会引起业务逻辑混乱，
     * 因为在实际应用中父类一般都是抽象类，子类是实现类，
     * 所以：子类中方法的前置条件必须与超类中被覆写的方法的前置条件相同或者更宽松
     */
}
