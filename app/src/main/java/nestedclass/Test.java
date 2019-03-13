package nestedclass;

/**
 * Created by lixiaoye on 2019/3/13.
 */
interface Incrementable {
    void increment();
}

class Outer5 {

    private class Inner5 implements Incrementable {

        @Override
        public void increment() {
            System.out.println("ceshi");
        }
    }

    public Incrementable getIn() {
        return new Inner5();
    }
}

public class Test {
    public static void main(String[] args) {
        Outer5 outer5 = new Outer5();
        Incrementable in1 = outer5.getIn();
        in1.increment();
    }
}

