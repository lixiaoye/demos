package data_structure.anonymousDemo;

/**
 * Created by LIXIAOYE on 2018/8/17.
 */
interface InterfaceA {
    void methodA();
}

public class Demo {
    public static void main(String[] args) {
        /**
         *
         * 在方法的参数位置new一个实例对象，并将该对象作为参数传给staticMethod方法；
         * new InterfaceA(){}表示创建的对象是接口InterfaceA的子类实例，该子类是匿名的。
         */
        staticMethod(new InterfaceA() {
            @Override
            public void methodA() {
                //...
            }
        });

    }

    private static void staticMethod(InterfaceA inter) {
        inter.methodA();
    }
}
