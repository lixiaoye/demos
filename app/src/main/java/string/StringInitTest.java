package string;

public class StringInitTest {
    public static void main(String[] args) {
        //1.创建一个空的字符串
        String str1 = new String();
        //2.创建一个内容为abcd的字符串
        String str2 = new String("abcd");
        //3.创建一个内容为字符数组的字符串
        char[] charArray = new char[]{'D', 'E', 'F'};
        String str3 = new String(charArray);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
    }
    /**
     * 打印结果：

     abcd
     DEF
     */
}
