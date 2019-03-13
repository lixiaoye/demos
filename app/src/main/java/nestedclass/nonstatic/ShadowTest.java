package nestedclass.nonstatic;

/**
 * Created by lixiaoye on 2019/3/12.
 */

public class ShadowTest {

    public int x = 0;

    public class FirstLevel {

        public int x = 1;

        void methodInFirstLevel(int x) {
            System.out.println("x = " + x);
            System.out.println("this.x = " + this.x);
            System.out.println("ShadowTest.this.x = " + ShadowTest.this.x);
        }
    }

    public static void main(String... args) {
        ShadowTest st = new ShadowTest();
        ShadowTest.FirstLevel fl = st.new FirstLevel();
        fl.methodInFirstLevel(23);
    }
    /**
     * 打印結果：
     * x = 23
     this.x = 1
     ShadowTest.this.x = 0
     */
}
