package design_pattern.creational.abstractfactory.demo3;


/**
 * Created by LIXIAOYE on 2018/11/7.
 */

public class Client {
    public static void main(String[] args) {
        //构建一个生产Q3的工厂
        CarFactory factoryQ3 = new Q3Factory();
        factoryQ3.createTire().tire();
        factoryQ3.createEngine().engine();
        factoryQ3.createBrake().brake();
        System.out.println("-------");
        CarFactory factoryQ7 = new Q7Factory();
        factoryQ7.createTire().tire();
        factoryQ7.createEngine().engine();
        factoryQ7.createBrake().brake();
/**
 *
 普通轮胎
 国产发动机
 普通制动
 -------
 越野轮胎
 进口发动机
 高级制动
 */
    }
}
