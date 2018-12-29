package design_pattern.behavioral.template.demo1;

/**
 * Created by LIXIAOYE on 2018/12/25.
 */

public class Test {
    public static void main(String[] args) {
        AbstractComputer computer = new CoderComputer();
        computer.startUp();
        computer = new MilitaryComputer();
        computer.startUp();

    }
    /**
     ------开机 start-------
     开启电源
     硬件检查
     载入操作系统
     程序员只需要进行用户和密码验证就可以了！

     ------开机 end-------
     ------开机 start-------
     开启电源
     硬件检查
     检查硬件防火墙
     载入操作系统
     进行指纹识别等复杂的用户验证

     ------开机 end-------

     */
}
