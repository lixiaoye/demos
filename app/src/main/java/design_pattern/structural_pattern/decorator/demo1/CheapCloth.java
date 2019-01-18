package design_pattern.structural_pattern.decorator.demo1;

/**
 * Created by LIXIAOYE on 2019/1/14.
 */

public class CheapCloth extends PersonCloth{
    public CheapCloth(Person person) {
        super(person);
    }
    private void dressShorts(){
        System.out.println("穿短裤");
    }

    @Override
    public void dressed() {
        super.dressed();
        dressShorts();
    }
}
