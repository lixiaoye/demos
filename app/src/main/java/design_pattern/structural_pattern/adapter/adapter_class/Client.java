package design_pattern.structural_pattern.adapter.adapter_class;

/**
 * Created by LIXIAOYE on 2019/1/15.
 */

public class Client {
    public static void main(String[] args) {
        VoltAdapter adapter = new VoltAdapter();
        System.out.println("输出电压：" + adapter.getVolt5());//输出电压：5
    }
}
