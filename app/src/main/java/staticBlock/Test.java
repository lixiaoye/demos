package staticBlock;

/**
 * Created by LIXIAOYE on 2019/1/18.
 */

public class Test {
    /**
     * 在类中定义且没有用static修饰没有名字的{}代码块称为构造代码块
     * 构造代码块：每创建一个对象则执行一次！
     */ {
        int x = 3;
        System.out.println("构造代码块1 x:" + x);
    }

    /**
     * 静态代码块：在一个程序里值执行一次！
     * 静态块优先于main方法执行，静态块>构造块>构造方法
     */
    static {
        int x = 6;//x局部变量，只能静态代码块中有效
        System.out.println("static block!");
    }

    {
        int x = 8;
        System.out.println("构造代码块2 x:" + x);
    }

    static int x, y;

    public static void main(String[] args) {
        System.out.println("main()");
        x--;//x=-1;
        myMethod();
        System.out.println(x + y++ + x);//x=1,y++=0,x=1 即1+0+1=2;
    }

    private static void myMethod() {
        //x++=-1 x=0, ++x=1,x=1;
        y = x++ + ++x;//y=-1+1=0；
    }
    /**
     * static block!
     main()
     2
     分析：
     (1)static静态代码块优先于main()方法执行;
     (2)构造代码块并没有执行！
     */
}
