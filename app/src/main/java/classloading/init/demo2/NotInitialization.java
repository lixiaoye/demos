package classloading.init.demo2;

/**
 * Created by lixiaoye on 2018/12/5.
 */

public class NotInitialization {
    public static void main(String[] args) {
        System.out.println(ConstClass.HELLOWORLD);
        /**
         * 打印结果：
         * hello world
         *分析：
         * 没有输出“ConstClass init!”
         * 因为虽然在Java源码中引用了ConstClass类中的常量HELLOWORLD,
         * 但是在编译阶段将此常量的值“hello world"存储到了NotInitialization类的常量池中，
         * 对常量ConstClass.HELLOWORLD的引用实际都被转化为NotInitialization类对自身常量池的引用了。
         * 也就是说实际上NotInitialization的Class文件之中并没有ConstClass类的符号引用入口,
         * 这两个类的编译成Class文件之后就不存在任何联系了。
         */
    }
}
