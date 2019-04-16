package hashmap.demo1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by lixiaoye on 2019/3/22.
 */

public class Test2 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "four");
        map.put(5, "five");
        /**
         * 1.使用map的keySet()方法遍历
         * 先取出map的key组成的Set集合，然后对Set集合进行遍历 ，通过map.get(key)取出value值
         */
        for (Integer key : map.keySet()) {
            System.out.println(key + ":" + map.get(key));
        }
        System.out.println("------------------------------");

        /**
         * 2. 使用Map的entrySet()方法返回一个以Entry为元素的Set集合，然后对Set集合进行遍历
         */
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
        System.out.println("------------------------------");
        /**
         * 3.通过keySet()返回的Set集合的iterator迭代器遍历
         */
        Iterator<Integer> iterator_key = map.keySet().iterator();
        while (iterator_key.hasNext()) {
            Integer key = iterator_key.next();
            System.out.println("key=" + key + ",value=" + map.get(key));
        }
        System.out.println("------------------------------");

        /**
         * 4. 通过entrySet()方法返回的Set的iterator遍历
         */
        Iterator<Map.Entry<Integer, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, String> entry = iterator.next();
            System.out.println("key=" + entry.getKey() + ",value=" + entry.getValue());
        }
        System.out.println("------------------------------");
        /**
         * 5.使用map的values()方法遍历集合的values
         * map.values()返回的是由map的值组成的Collection，只能遍历所有的value，不能得到map的key
         */
        for (String value : map.values()) {
            System.out.println(value);
        }
        System.out.println("------------------------------");

        /**
         * 6.通过values()返回的Collection的iterator遍历
         * map.values()方法返回的是一个Collection集合，这个集合对象可以使用iterator方法访问
         */
        Iterator<String> it = map.values().iterator();
        while (it.hasNext()) {
            String value = it.next();
            System.out.println("value=" + value);
        }
        System.out.println("------------------------------");
/**
 * 打印结果：
 1:one
 2:two
 3:three
 4:four
 5:five
 ------------------------------
 1:one
 2:two
 3:three
 4:four
 5:five
 ------------------------------
 key=1,value=one
 key=2,value=two
 key=3,value=three
 key=4,value=four
 key=5,value=five
 ------------------------------
 key=1,value=one
 key=2,value=two
 key=3,value=three
 key=4,value=four
 key=5,value=five
 ------------------------------
 one
 two
 three
 four
 five
 ------------------------------
 value=one
 value=two
 value=three
 value=four
 value=five
 ------------------------------
 */
    }
}
