package classloading.init.demo6;

import android.os.Handler;

/**
 *
 */

public class Test {//类加载时将类信息放入方法区
    public static void main(String[] args) {//main方法放入方法区
        Student stu = new Student("yeatslee");
        /**
         * 1.stu是对Student对象的引用，放入栈中，指向堆中对象的内存地址；
         * 2.new出来的Student对象放入堆中，并持有方法区中Student类型信息的引用；
         *
         */

        stu.add();
        /**
         * 1.执行add方法时，根据stu定位到堆中的对象实例，
         * 2.再根据堆中持有的位于方法区的Student类型信息，获得add()字节码，执行此方法，打印结果
         */
        Handler handler=new Handler();
    }
}
