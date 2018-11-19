package data_structure.hashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Test1 {
    public static void main(String[] args) {
        Map map = new HashMap();//创建Map对象
        map.put("1", "Jack");//存储键和值
        map.put("2", "Rose");
        map.put("3", "Lucy");
        Collection values = map.values();
        Iterator it = values.iterator();
        while (it.hasNext()) {
            Object value = it.next();
            System.out.print(value+",");//Jack,Rose,Lucy,
        }

      /*  Set keySt = map.keySet();//获取键的集合
        Iterator it = keySt.data_structure.iterator();//迭代键的集合
        while (it.hasNext()) {
            Object key = it.next();
            Object value = map.get(key);
            System.out.println(key + ":" + value);
        }
        */
     /*   Set entrySet = map.entrySet();
        Iterator it = entrySet.data_structure.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            System.out.println(key + ":" + value);
        }*/

        /**
         * 打印结果：
         * 1:Jack
         2:Rose
         3:Lucy
         */


    }
}
