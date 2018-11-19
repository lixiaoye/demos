package treemap;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class Test1 {
    public static void main(String[] args) {
        TreeMap treeMap = new TreeMap();
        treeMap.put("1", "Jack");
        treeMap.put("2", "Rose");
        treeMap.put("3", "Lucy");
        Set keySet = treeMap.keySet();
        Iterator it = keySet.iterator();
        while (it.hasNext()) {
            Object key = it.next();
            Object value = treeMap.get(key);
            System.out.print(key + ":" + value + ", ");//1:Jack, 2:Rose, 3:Lucy,
        }
    }
}
