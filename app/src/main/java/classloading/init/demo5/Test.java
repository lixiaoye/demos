package classloading.init.demo5;

/**
 * Created by lixiaoye on 2018/12/6.
 */

class A {
    float x, y;
    static float z;

    A(float a, float b, float c) {
        x = a;
        y = b;
        z = c;
    }
}

public class Test {
    public static void main(String[] args) {
        A a1 = new A(1, 2, 3);
        System.out.println("a1.z=" + a1.z);
        A a2 = new A(4, 5, 6);
        System.out.println("a1.z=" + a1.z);
        System.out.println("a2.z=" + a2.z);

        System.out.println("A.z=" + A.z);
    }
    /**
     * 打印结果:
     a1.z=3.0
     a1.z=6.0
     a2.z=6.0
     A.z=6.0
     */
}
