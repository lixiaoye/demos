package lxy.android.com.mvpdemo.after.demo3.model;

/**
 * Created by LIXIAOYE on 2019/2/26.
 */

public class UserInfoModel {
    private String name;
    private int age;
    private String country;

    public UserInfoModel(String name, int age, String country) {
        this.name = name;
        this.age = age;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
