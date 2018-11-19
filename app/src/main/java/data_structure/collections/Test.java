package data_structure.collections;

import java.util.ArrayList;
import java.util.Collections;

public class Test {
    public static void main(String[] args) {
      /*  ArrayList data_structure.list = new ArrayList();
        Collections.addAll(data_structure.list, "C", "Z", "B", "K");//添加元素
        System.out.println("排序前：" + data_structure.list);//排序前：[C, Z, B, K]
        Collections.reverse(data_structure.list);
        System.out.println("反转后：" + data_structure.list);//反转后：[K, B, Z, C]
        Collections.sort(data_structure.list);
        System.out.println("按自然顺序排序后：" + data_structure.list);//按自然顺序排序后：[B, C, K, Z]
        Collections.shuffle(data_structure.list);
        System.out.println("洗牌后：" + data_structure.list);//洗牌后：[Z, K, C, B]*/

        ArrayList list = new ArrayList();
        Collections.addAll(list, -3, 2, 9, 5, 8);
        System.out.println("集合中的元素：" + list);//集合中的元素：[-3, 2, 9, 5, 8]
        System.out.println("集合中的最大元素：" + Collections.max(list));//集合中的最大元素：9
        System.out.println("集合中的最小元素：" + Collections.min(list));//集合中的最小元素：-3
        Collections.replaceAll(list, 8, 0);//将集合中的8用0替换掉
        System.out.println("替换后的集合：" + list);//替换后的集合：[-3, 2, 9, 5, 0]

    }
}
