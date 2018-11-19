package data_structure.lsp.demo1;

import java.util.HashMap;

/**
 * 放大输入参数类型
 */

public class Client {
    public static void main(String[] args) {
//        invoker();
        invoker2();
    }

    private static void invoker2() {
        Son son = new Son();
        HashMap hashMap = new HashMap();
        son.doSomething(hashMap);//父类doSomething...
    }

    private static void invoker() {
        //父类存在的地方，子类就应该能够存在
        Father f = new Father();
        HashMap hashMap = new HashMap();
        f.doSomething(hashMap);//父类doSomething...
    }
    /***
     * 分析：
     * 父类方法的输入参数是HashMap类型，子类的输入参数是Map类型，
     * 也就是说子类的输入参数类型的范围扩大了，子类代替父类传递到调用者中，子类的方法永远都不会执行。
     * 这是正确的，如果想让子类的方法运行，就必须覆写父类的方法。
     */
}
