package design_pattern.structural_pattern.adapter.adapter_class;

/**
 * Adapter角色，将220V的电压转换成5V的电压
 */
public class VoltAdapter extends Volt220 implements FiveVolt {
    @Override
    public int getVolt5() {
        return 5;
    }
}
