package stringBuffer;

public class Test1 {
    public static void main(String[] args) {
       /* System.out.println("1.添加----------");
        add();
        System.out.println("2.删除----------");
        remove();
        System.out.println("3.修改----------");
        alter();*/

       /* String s1 = new String("abc");
        String s2 = new String("abc");
        System.out.println(s1.equals(s2));//true

        StringBuffer sb1 = new StringBuffer("abc");
        StringBuffer sb2 = new StringBuffer("abc");
        System.out.println(sb1.equals(sb2));//false*/

        String s1 = "a";
        String s2 = "b";
        String s3 = s1 + s2;
        System.out.println(s3);//ab

        StringBuffer sb1 = new StringBuffer("a");
        StringBuffer sb2 = new StringBuffer("b");
//        StringBuffer sb3 = sb1 + sb2;//编译出错：Operator'+'cannot be applied to 'java.lang.StringBuffer','java.lang.StringBuffer'
    }

    private static void alter() {
        StringBuffer sb = new StringBuffer("abcdef");
        sb.setCharAt(1, 'p');
        System.out.println("修改指定位置字符结果：" + sb);//apcdef
        sb.replace(1, 3, "qq");//替换指定位置字符串或字符
        System.out.println("替换指定位置字符（串）结果：" + sb);//aqqdef
        System.out.println("字符串翻转结果：" + sb.reverse());//fedqqa
    }

    private static void remove() {
        StringBuffer sb = new StringBuffer("abcdefg");
        sb.delete(1, 5);//指定范围删除
        System.out.println("删除指定位置结果:" + sb);//afg
        sb.deleteCharAt(2);//指定位置删除
        System.out.println("删除指定位置结果:" + sb);//af
        sb.delete(0, sb.length());//清空缓存区
        System.out.println("清空缓存区结果：" + sb);//""
    }

    private static void add() {
        StringBuffer sb = new StringBuffer();//定义一个字符串缓冲区
        sb.append("abcdefg");
        System.out.println("append添加结果：" + sb);//abcdefg
        sb.insert(2, "123");
        System.out.println("insert添加结果：" + sb);//ab123cdefg
    }
    /**
     * 打印结果：
     1.添加----------
     append添加结果：abcdefg
     insert添加结果：ab123cdefg
     2.删除----------
     删除指定位置结果:afg
     删除指定位置结果:af
     清空缓存区结果：
     3.修改----------
     修改指定位置字符结果：apcdef
     替换指定位置字符（串）结果：aqqdef
     字符串翻转结果：fedqqa
     */
}
