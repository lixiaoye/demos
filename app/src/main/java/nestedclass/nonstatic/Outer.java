package nestedclass.nonstatic;


/**
 * Created by lixiaoye on 2019/3/12.
 */

public class Outer {
    private int a;
    private static String b = "b";
    private static class StaticInner implements HelloWorld{

        @Override
        public void greet() {

        }

        @Override
        public void greetSomeone(String sb) {

        }
    }

    private class MemberInner {//成员内部类

        private void fun1() {
            System.out.println(a);
            System.out.println(b);
        }
    }

    private void method() {
        class MethodInner implements HelloWorld{//方法内部类

            private void fun2() {
                System.out.println(a);
                System.out.println(b);
            }

            @Override
            public void greet() {

            }

            @Override
            public void greetSomeone(String sb) {

            }
        }
    }

    abstract class AnonymousInner {
        public abstract void anonyMethod();
    }

    public void method2(String[] args) {
        AnonymousInner inner = new AnonymousInner() {//匿名内部类


            @Override
            public void anonyMethod() {

            }

            int aa = a;
            String bb = b;
        };
    }

    private void method1() {
        new HelloWorld() {

            @Override
            public void greet() {

            }

            @Override
            public void greetSomeone(String sb) {

            }
        };
    }
//
    interface HelloWorld {
        void greet();
        void greetSomeone(String sb);
    }

    public static void main(String[] args) {
        Outer outer=new Outer();
        MemberInner inner=outer.new MemberInner();
    }

}
