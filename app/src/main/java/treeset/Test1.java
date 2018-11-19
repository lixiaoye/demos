package treeset;

import android.support.annotation.NonNull;

import java.util.Iterator;
import java.util.TreeSet;

class Student implements Comparable {

    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + ":" + age;
    }

    //重写Comparable接口的compareTo方法
    @Override
    public int compareTo(@NonNull Object o) {
        Student stu = (Student) o;
        if (this.age - stu.age > 0) {
            return 1;
        }
        if (this.age - stu.age == 0) {
            return this.name.compareTo(stu.name);
        }
        return -1;
    }
}

public class Test1 {
    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet();
        treeSet.add(new Student("Jack", 19));
        treeSet.add(new Student("Rose", 18));
        treeSet.add(new Student("Tom", 19));
        treeSet.add(new Student("Rose", 18));
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + ",");//Rose:18,Jack:19,Tom:19,
        }
    }
}
