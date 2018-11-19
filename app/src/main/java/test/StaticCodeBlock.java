package test;

/**
 * Created by LIXIAOYE on 2018/8/16.
 */

public class StaticCodeBlock {

    public static void main(String[] args) {
        Lady lady1 = new Lady();
        Lady lady2 = new Lady();

    }

    //静态代码块
    static {
        System.out.println("Main函数所在的类的静态代码块执行了");
    }

    /**
     * 打印结果：
     * Main函数所在的类的静态代码块执行了
     Lady类中的静态代码块执行了
     分析：虚拟机首先加载StaticCodeBlock类，在加载类的同时就会执行该类的静态代码块，紧接着调用main方法。
     两次实例化对象，但是静态代码块只执行一次。这说明类在第一次使用时才会加载，并且只会加载一次。
     */

}

class Lady {
    static String country;

    static {
        country = "china";
        System.out.println("Lady类中的静态代码块执行了");
    }

}

