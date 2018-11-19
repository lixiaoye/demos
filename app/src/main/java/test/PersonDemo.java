package test;

/**
 * Created by LIXIAOYE on 2018/8/16.
 */

public class PersonDemo {
    public static void main(String[] args) {
        Person p = new Person();

        p = null;//将变量置为null,让对象成为垃圾
        System.gc();//调用方法进行垃圾回收

        for (int i=0;i<1000000;i++){
            //为了延长程序运行的时间

        }

    }
}
