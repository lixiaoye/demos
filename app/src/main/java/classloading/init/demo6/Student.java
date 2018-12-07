package classloading.init.demo6;

/**
 * Created by lixiaoye on 2018/12/7.
 */

public class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void add() {
        System.out.println(name);
    }
}
