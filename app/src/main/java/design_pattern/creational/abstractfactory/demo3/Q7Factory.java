package design_pattern.creational.abstractfactory.demo3;

/**
 * Created by LIXIAOYE on 2018/11/7.
 */

public class Q7Factory extends CarFactory {
    @Override
    public ITire createTire() {
        return new SUVTire();
    }

    @Override
    public IEngine createEngine() {
        return new ImportEngine();
    }

    @Override
    public IBrake createBrake() {
        return new SeniorBrake();
    }
}
