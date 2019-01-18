package design_pattern.structural_pattern.decorator.demo1;

/**
 * Created by LIXIAOYE on 2019/1/14.
 */

public abstract class PersonCloth extends Person {
    protected Person mPerson;//持有一个Person类的引用

    public PersonCloth(Person person) {
        this.mPerson = person;
    }

    @Override
    public void dressed() {
        //调用Person类中的dressed方法
        mPerson.dressed();
    }
}
