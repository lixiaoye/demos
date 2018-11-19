package data_structure.finalDemo;

/**
 * Created by LIXIAOYE on 2018/8/17.
 */

class Outer {
    void change(final int num) {
        final String name = "lixiaoye";
        class Inner {
            void show() {
//                变量从内部类中进行修改，需要声明为final
                System.out.println("num:" + num);//Variable 'num' is accedded from within inner class,needs to be declared final
                System.out.println("name:" + name);//Variable 'name' is accedded from within inner class,needs to be declared final
            }
        }
        Inner inner = new Inner();
        inner.show();
    }
}

public class OuterFinal {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.change(3);
        /**
         * 打印结果：
         * num:3
         name:lixiaoye
         */
    }
}
