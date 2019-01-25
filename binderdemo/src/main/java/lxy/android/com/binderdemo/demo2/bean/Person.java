package lxy.android.com.binderdemo.demo2.bean;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by LIXIAOYE on 2019/1/25.
 */

public class Person implements Parcelable {
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    protected Person(Parcel in) {
        id = in.readInt();
        name = in.readString();
    }

    public static final Creator<Person> CREATOR = new Creator<Person>() {
        @Override
        public Person createFromParcel(Parcel in) {
            return new Person(in);
        }

        @Override
        public Person[] newArray(int size) {
            return new Person[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(id);
        dest.writeString(name);
    }

    @Override
    public String toString() {
        return "Person{" + "id='" + id
                + "\'" + " ,name:" + name + "}";
    }
}
