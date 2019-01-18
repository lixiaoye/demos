package design_pattern.structural_pattern.bridge.demo2;

/**
 * Created by LIXIAOYE on 2019/1/15.
 */

public class LinuxImpl implements ImageImpl{
    @Override
    public void doPaint(Matrix matrix) {
        //调用Linux系统的绘制函数绘制图像矩阵
        System.out.println("在Linux操作系统中显示图像");
    }
}
