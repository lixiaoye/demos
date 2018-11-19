package data_structure.linkedList;

import java.util.LinkedList;

public class Test1 {
    public static void main(String[] args) {
        LinkedList link = new LinkedList();//创建LinkedList集合
        link.add("lxy1");
        link.add("lxy2");
        link.add("lxy3");
        link.add("lxy4");
        System.out.println(link.toString());//[lxy1, lxy2, lxy3, lxy4]
        link.add(3, "Russell001");
        link.addFirst("First");
        System.out.println(link);//[First, lxy1, lxy2, lxy3, Russell001, lxy4]
        System.out.println(link.getFirst());//First
        link.remove(3);
        link.removeFirst();
        System.out.println(link);//[lxy1, lxy2, Russell001, lxy4]
    }
}
