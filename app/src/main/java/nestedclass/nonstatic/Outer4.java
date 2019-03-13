package nestedclass.nonstatic;

/**
 * Created by lixiaoye on 2019/3/12.
 */

public class Outer4 {
    private int a = 0;
    private static final String s = "ss";

    static class Inner {//静态内部类
        private int age = 0;
        private String name = "Inner";
        private static String sex = "male";
        private static void getMethod(){

        }

        public void print() {
//            System.out.println(a);//静态内部类不可以访问外部类的非静态成员。
            System.out.println(s);
        }
    }

    public void outPrint() {
        Inner inner = new Inner();
        System.out.println(inner.age);//外部类访问内部类(包括静态和非静态)的非静态成员需要实例化内部类！
        System.out.println(inner.name);
        System.out.println(Inner.sex);//外部类访问静态内部类的静态成员不需要实例化内部类！
    }
}
