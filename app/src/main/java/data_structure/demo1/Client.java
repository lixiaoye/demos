package data_structure.demo1;

/**
 * Created by LIXIAOYE on 2018/11/1.
 */

public class Client {
    public static void main(String[] args) {
        IDriver lisi = new Driver();
        ICar benz = new Benz();
        lisi.drive(benz);//Benz run...

        ICar bmw = new BMW();
        lisi.drive(bmw);//BMW run...
    }
}
