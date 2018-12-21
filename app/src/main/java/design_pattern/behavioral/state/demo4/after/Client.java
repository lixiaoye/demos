package design_pattern.behavioral.state.demo4.after;

/**
 * 客户端测试代码
 */

public class Client {
    public static void main(String[] args) {
        TvController tvController=new TvController();
        //设置开机状态
        tvController.powerOn();
        //下一频道
        tvController.nextChannel();
        //调高音量
        tvController.turnUp();
        //设置关机状态
        tvController.powerOff();
        //调高音量，此时不会生效
        tvController.turnUp();
    }
    /**
     * 打印结果：
         开机啦
         下一频道
         调高音量
         关机啦
     */
}
