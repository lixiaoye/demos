package test;

/**
 * Created by LIXIAOYE on 2018/8/15.
 */

public class Test {

    public static void main(String[] args) {

        int[] arr;//声明变量
        arr = new int[3];//创建数组对象
        System.out.println("arr[0]=" + arr[0]);//访问数组中的第一个元素
        System.out.println("arr[1]=" + arr[1]);//访问数组中的第一个元素
        System.out.println("arr[2]=" + arr[2]);//访问数组中的第一个元素
        System.out.println("length=" + arr.length);//数组长度
        /**
         * 打印结果：
         *
         * arr[0]=0
         arr[1]=0
         arr[2]=0
         length=3
         */
//        int[] x=new int[4]{1,2,3,4};//错误

        int[] y=new int[]{1,2,3,4};//正确
    }
}
