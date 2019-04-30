package com.example.jvmdemo;

/**
 * Created by lixiaoye on 2019/4/21.
 */

public class TestStatics {
    static int x = 10;//静态变量，也叫类变量

    static {//静态代码块1
        x += 5;//x=15
    }

    public static void main(String[] args) {
        System.out.println("x=" + x);//x=5
    }

    static {////静态代码块2
        x /= 3;//x=5
    }

    /**
     * 类加载：在准备阶段，先进行静态成员初始化，静态代码块也可以看作静态成员，
     * 初始化的顺序：按照定义的先后顺序进行，
     * 如果把x类变量定义放在最后就会报错！
     * 执行顺序：类变量>静态代码块>main方法
     */

}
