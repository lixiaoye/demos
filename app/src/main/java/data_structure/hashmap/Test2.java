package data_structure.hashmap;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Test2 {
    public static void main(String[] args) {
        Map map = new LinkedHashMap();
        map.put("1", "Jack");
        map.put("2", "Rose");
        map.put("3", "Lucy");
        Set keySet = map.keySet();
        Iterator it = keySet.iterator();
        while (it.hasNext()) {
            Object key = it.next();
            Object value = map.get(key);
            System.out.print(key + ":" + value+",");//1:Jack,2:Rose,3:Lucy,
        }
    }
}
