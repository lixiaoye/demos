package design_pattern.structural_pattern.bridge.demo2;

/**
 * Created by LIXIAOYE on 2019/1/15.
 */

public class UnixImpl implements ImageImpl{
    @Override
    public void doPaint(Matrix matrix) {
        System.out.println("在Unix操作系统中显示图像");
    }
}
