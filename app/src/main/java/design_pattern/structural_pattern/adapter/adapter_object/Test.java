package design_pattern.structural_pattern.adapter.adapter_object;

/**
 * Created by LIXIAOYE on 2019/1/15.
 */

public class Test {
    public static void main(String[] args) {
        VoltAdapter adapter = new VoltAdapter(new Volt220());
        System.out.println("输出电压：" + adapter.getVolt5());//输出电压：5
    }
}
