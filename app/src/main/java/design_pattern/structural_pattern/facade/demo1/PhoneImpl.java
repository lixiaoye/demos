package design_pattern.structural_pattern.facade.demo1;

/**
 * Created by LIXIAOYE on 2019/1/14.
 */

public class PhoneImpl implements Phone {
    @Override
    public void dail() {
        System.out.println("打电话");
    }

    @Override
    public void hangup() {
        System.out.println("挂断");
    }
}
