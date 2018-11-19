package treeset;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

class MyComparator implements Comparator {

    //重写compare方法，按照字符串长度排序
    @Override
    public int compare(Object o1, Object o2) {
        String s1 = (String) o1;
        String s2 = (String) o2;
        return s1.length() - s2.length();
    }
}

public class Test2 {
    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet(new MyComparator());//创建TreeSet对象时传入自定义比较器
        treeSet.add("Jack");
        treeSet.add("Helena");
        treeSet.add("Eve");
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            Object obj = it.next();
            System.out.print(obj + ", ");//Eve, Jack, Helena,
        }

    }
}