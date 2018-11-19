package data_structure.finalDemo;

/**
 * Created by LIXIAOYE on 2018/8/17.
 */

class Student {
    //使用final关键字修饰name属性
    final String name = null;//报错：//Variable 'name'might not have been initialized.

    public void introduce() {
        System.out.println("学生名：" + name);
    }
}

public class FinalTest {
    public static void main(String[] args) {
        Student student = new Student();//创建Student类的实例对象
        student.introduce();//调用
    }
}
