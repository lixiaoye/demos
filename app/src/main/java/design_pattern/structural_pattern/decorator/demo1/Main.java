package design_pattern.structural_pattern.decorator.demo1;

/**
 * Created by LIXIAOYE on 2019/1/14.
 */

public class Main {
    public static void main(String[] args) {
        Person person = new Boy();
        PersonCloth clothCheap = new CheapCloth(person);
        clothCheap.dressed();

        PersonCloth clothExpensive = new ExpensiveCloth(person);
        clothExpensive.dressed();
    }
}
