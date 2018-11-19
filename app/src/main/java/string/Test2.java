package string;

public class Test2 {
    public static void main(String[] args) {
        String s = "Russell Wong";
        //字符串替换操作
        System.out.println("将 Russell替换成Russell Girard: " +
                s.replace("Russell", "Russell Girard"));
        //字符串去除空格操作
        String s1 = " l i xi ao y e ";
        System.out.println("去除字符串两端空格后的结果：" + s1.trim());
        System.out.println("去除字符串中所有空格后的结果：" + s1.replace(" ", ""));
    }
    /**
     * 打印结果：
     将 Russell替换成Russell Girard: Russell Girard Wong
     去除字符串两端空格后的结果：l i xi ao y e
     去除字符串中所有空格后的结果：lixiaoye
     */
}
