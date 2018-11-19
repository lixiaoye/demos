package data_structure.demo1;

/**
 * Created by LIXIAOYE on 2018/11/1.
 */

public class Driver implements IDriver {
    @Override
    public void drive(ICar car) {
        car.run();
    }
}
