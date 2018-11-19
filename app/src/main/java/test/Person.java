package test;

/**
 * Created by LIXIAOYE on 2018/8/16.
 */

public class Person {
    int age;
    String name;

    public Person() {
    }

    public Person(int age, String name) {
        this();
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("对象将被作为垃圾被回收...");
    }
}
