package design_pattern.structural_pattern.flyweight.demo1;

/**
 * Created by LIXIAOYE on 2018/12/26.
 */

public class TestString {
    public static void main(String[] args) {
        String str1 = new String("abc");
        String str2 = "abc";
        String str3 = new String("abc");
        String str4 = "ab" + "c";

        //使用equals中判定字符值
        System.out.println(str1.equals(str2));//true
        System.out.println(str1.equals(str3));//true
        System.out.println(str3.equals(str2));//true

        //==:判定两个对象是否是同一个地址
        System.out.println(str1 == str2);//false
        System.out.println(str1 == str3);//false
        System.out.println(str3 == str2);//false
        System.out.println(str4 == str2);//true
        Thread.interrupted();
        /**
         * JDK中String也是类似消息池。
         * 在Java中String是存在于常量池中。
         * 也就是说一个String被定义之后它就会缓存到了常量池中，
         * 当其他地方要使用同样的字符串时，则直接使用的是缓存，而不会重复创建。
         * *********************************************
         * str2和str4都是通过字面值复制的，也就是直接通过双引号设置的字符串值，
         * 也就是说str2和str4是同一个字符串对象。
         * 因为str4使用了缓存在常量池中的str2对象。这就是享元模式在开发中的一个应用。
         */
    }
}
