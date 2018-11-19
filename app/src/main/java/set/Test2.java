package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

class Student {
    String id;
    String name;

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
    }

    //重写hashCode方法
    @Override
    public int hashCode() {
        return id.hashCode();
    }

    //重写equals方法
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {//判断是否是同一个对象
            return true;
        }
        if (!(obj instanceof Student)) {
            return false;
        }
        Student stu = (Student) obj;
        return this.id.equals(stu.id);
    }

    //重写toString()方法
    @Override
    public String toString() {
        return id + ":" + name;
    }
}

public class Test2 {
    public static void main(String[] args) {
       /* HashSet hs = new HashSet();//创建HashSet对象
        Student stu1 = new Student("1", "Jack");
        Student stu2 = new Student("2", "Rose");
        Student stu3 = new Student("2", "Rose");
        hs.add(stu1);
        hs.add(stu2);
        hs.add(stu3);
        System.out.println(hs);//[1:Jack, 2:Rose]*/

        TreeSet treeSet = new TreeSet();//创建TreeSet集合
        treeSet.add("Jack");
        treeSet.add("Helena");
        treeSet.add("Helena");
        treeSet.add("Eve");
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");//Eve Helena Jack
        }
    }
}





