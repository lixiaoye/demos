package classloading.init.demo5;

/**
 * Created by lixiaoye on 2018/12/6.
 */
class B {
    float x, y;
    static float z;

    B(float a, float b, float c) {
        x = a;
        y = b;
        z = c;
    }

    public void display() {
        System.out.println("x=" + x + ";y=" + y + ";z=" + z);
    }

    public static void change(float value) {
        z = value;
    }
}

public class Test2 {
    public static void main(String[] args) {
        B b1 = new B(1, 2, 3);
        b1.display();
        B b2 = new B(4, 5, 6);
        b1.display();
        b2.display();

        b1.change(101);
        b1.display();
        b2.change(102);
        b2.display();
    }
    /**
     * 打印结果：
     x=1.0;y=2.0;z=3.0
     x=1.0;y=2.0;z=6.0
     x=4.0;y=5.0;z=6.0
     x=1.0;y=2.0;z=101.0
     x=4.0;y=5.0;z=102.0
     */
}
