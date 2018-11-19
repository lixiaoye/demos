package string;

public class StringTest {
    public static void main(String[] args) {
      /*  String str = "abcdedcba";//声明字符串
        System.out.println("字符串的长度为：" + str.length());
        System.out.println("字符串中第一个字符：" + str.charAt(0));
        System.out.println("字符串c第一次出现的位置：" + str.indexOf('c'));
        System.out.println("字符串c最后一次出现的位置：" + str.lastIndexOf('c'));*/

/*        String str = "abcd";
        System.out.println("将字符串转为字符数组后的结果：");
        char[] charArray = str.toCharArray();//字符串转换为字符数组
        for (int i = 0; i < charArray.length; i++) {
            if (i != charArray.length - 1) {
                System.out.print(charArray[i] + ",");
            } else {
                System.out.println(charArray[i]);
            }
        }
        System.out.println("将int值转换为String类型之后的结果：" + String.valueOf(12));
        System.out.println("将字符串转换成大写之后的结果：" + str.toUpperCase());*/


        /*String s1 = "String";//声明一个字符串
        String s2 = "Str";
        System.out.println("判断是否以字符串str开头:" + s1.startsWith("Str"));
        System.out.println("判断是否以字符串ng结尾：" + s1.endsWith("ng"));
        System.out.println("判断是否包含字符串tri:" + s1.contains("tri"));
        System.out.println("判断字符串是否为空：" + s1.isEmpty());
        System.out.println("判断两个字符串是否相等：" + s1.equals(s2));*/

       /* String str1 = new String("abc");
        String str2 = new String("abc");
        System.out.println("str1==str2" + str1 == str2);//false
        System.out.println("str1.equals(str2):" + str1.equals(str2));//true

        String str3 = "abc";
        String str4 = "abc";
        System.out.println("str3==str4" + str3 == str4);//false
        System.out.println("str3.equals(str4):" + str3.equals(str4));//true*/

        /*String str = "羽毛球-篮球-兵乓球";
        System.out.println(str.substring(4));//篮球-兵乓球
        System.out.println(str.substring(4, 6));//篮球

        String[] strArray = str.split("-");//将字符串转换为字符串数组
        for (int i = 0; i < strArray.length; i++) {
            if (i != strArray.length - 1) {
                System.out.print(strArray[i] + ",");
            } else {
                System.out.println(strArray[i]);
            }
            //羽毛球,篮球,兵乓球
        }*/

       /* String s="abcdedcba";//
        System.out.println(s.length());//9
        System.out.println(s.charAt(10));//Exception in thread "main" java.lang.StringIndexOutOfBoundsException: String index out of range: 10*/

    }
    /**
     打印结果：
     判断是否以字符串str开头:true
     判断是否以字符串ng结尾：true
     判断是否包含字符串tri:true
     判断字符串是否为空：false
     判断两个字符串是否相等：false
     */

}
