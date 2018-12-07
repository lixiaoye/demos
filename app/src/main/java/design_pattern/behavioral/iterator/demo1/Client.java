package design_pattern.behavioral.iterator.demo1;

/**
 * Created by LIXIAOYE on 2018/11/26.
 */

public class Client {
    public static void main(String[] args) {
        Aggregate<String> a = new ConcreteAggregate<>();
        a.add("Aige");
        a.add("Studio\n");
        a.add("SM");
        a.add(" Brother");
        Iterator<String> iterator = a.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
