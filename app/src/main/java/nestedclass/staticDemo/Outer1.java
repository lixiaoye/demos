package nestedclass.staticDemo;

/**
 * Created by lixiaoye on 2019/3/12.
 */

public class Outer1 {
    private int a=0;
    private static int b=10;

    static class StaticClass{
        private String name="static nested class";
        private static String flag="haha";
        public void print(){
            System.out.println();
        }
    }

    public static void main(String[] args) {

    }
}
