/**
 * Created by LIXIAOYE on 2018/10/15.
 */

public class Test {
    public static void main(String[] args) {
        Event obj = new Event(1, "haha");
        Event obj1, obj2;
        obj1 = obj;
        obj2 = obj;
        obj1.setSummary("我修改了");
        System.out.println("obj:" + obj.summary);
        System.out.println("obj1:" + obj1.summary);
        System.out.println("obj2:" + obj2.summary);
    }
}

class Event {
    String summary;
    int id;

    public Event(int id, String summary) {
        this.id = id;
        this.summary = summary;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}