package data_structure.foreach;


import java.util.Enumeration;
import java.util.Vector;

public class Test1 {
    static String[] strs = {"aaa", "bbb", "ccc"};

    public static void main(String[] args) {
   /*     ArrayList data_structure.list = new ArrayList();//创建ArrayList集合
        data_structure.list.add("心理罪");
        data_structure.list.add("傲慢与偏见");
        data_structure.list.add("百年孤独");
        data_structure.list.add("喜福会");
        for (Object obj : data_structure.list) {
            System.out.print(obj + " ");//心理罪 傲慢与偏见 百年孤独 喜福会
        }*/

        /*for (String str : strs) {
            str = "add";
        }
        System.out.println("foreach循环修改数组：" + strs[0] + " " + strs[1] + " " + strs[2]);//foreach循环修改数组：aaa bbb ccc

        for (int i = 0; i < strs.length; i++) {
            strs[i] = "add";
        }
        System.out.println("普通for循环修改数组：" + strs[0] + " " + strs[1] + " " + strs[2]);//普通for循环修改数组：add add add*/


      /*  ArrayList data_structure.list = new ArrayList();//创建ArrayList集合
        data_structure.list.add("心理罪");
        data_structure.list.add("傲慢与偏见");
        data_structure.list.add("百年孤独");
        data_structure.list.add("喜福会");
        Iterator it = data_structure.list.data_structure.iterator();
        while (it.hasNext()) {
            Object obj = it.next();
            if ("心理罪".equals(obj)) {
//                data_structure.list.remove(obj);
//                break;
                it.remove();
            }
        }
        System.out.println(data_structure.list);*/
        /**
         * Exception in thread "main" java.util.ConcurrentModificationException
         at java.util.ArrayList$Itr.checkForComodification(ArrayList.java:901)
         at java.util.ArrayList$Itr.next(ArrayList.java:851)
         at data_structure.foreach.Test1.main(Test1.java:38)
         at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
         at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
         at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
         at java.lang.reflect.Method.invoke(Method.java:498)
         at com.intellij.rt.execution.application.AppMainV2.main(AppMainV2.java:131)
         */

      /*  ArrayList data_structure.list = new ArrayList();
        data_structure.list.add("data_1");
        data_structure.list.add("data_2");
        data_structure.list.add("data_3");
        data_structure.list.add("data_4");
        System.out.println(data_structure.list);//[data_1, data_2, data_3, data_4]
        ListIterator it = data_structure.list.listIterator(data_structure.list.size());
        while (it.hasPrevious()) {
            Object obj = it.previous();
            System.out.print(obj + " ");//data_4 data_3 data_2 data_1
        }*/

        Vector vector = new Vector();//创建Vector对象
        vector.add("Aaa");
        vector.add("Baa");
        vector.add("Caa");
        vector.add("Daa");
        Enumeration enumeration = vector.elements();//获得Enumeration对象
        while (enumeration.hasMoreElements()) {//判断该对象是否有更多元素
            Object obj = enumeration.nextElement();//取出该对象的下一个元素
            System.out.print(obj + " ");//Aaa Baa Caa Daa
        }

    }
}
