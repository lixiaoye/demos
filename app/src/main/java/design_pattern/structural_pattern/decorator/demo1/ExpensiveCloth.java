package design_pattern.structural_pattern.decorator.demo1;

/**
 * Created by LIXIAOYE on 2019/1/14.
 */

public class ExpensiveCloth extends PersonCloth {
    public ExpensiveCloth(Person person) {
        super(person);
    }

    private void dressShirt() {
        System.out.println("穿短袖");
    }

    private void dressLeather() {
        System.out.println("穿皮衣");
    }

    private void dressJean() {
        System.out.println("穿牛仔裤");
    }

    @Override
    public void dressed() {
        super.dressed();
        dressShirt();
        dressLeather();
        dressJean();
    }
}
