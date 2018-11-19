package data_structure.list;


import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();//创建ArrayList集合
        list.add("stu1");//向集合中添加元素
        list.add("stu2");
        list.add("stu3");
        list.add("stu4");
        System.out.println(list.size());//4
        System.out.println(list.get(1));//stu2
        /**
         * D:\work\ReflectDemo\app\src\main\java\data_structure.list>javac Test1.java
         注: Test1.java使用了未经检查或不安全的操作。
         注: 有关详细信息, 请使用 -Xlint:unchecked 重新编译。
         */

    }
}
