package data_structure.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Test1 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();//创建ArrayList集合
        arrayList.add("d001");
        arrayList.add("d002");
        arrayList.add("d003");
        arrayList.add("d004");
        Iterator it = arrayList.iterator();//获取Iterator对象
        while (it.hasNext()) {//判断ArrayList集合中是否存在下一个元素
            Object obj = it.next();
            System.out.print(obj + " ");//d001 d002 d003 d004
        }
    }
}
