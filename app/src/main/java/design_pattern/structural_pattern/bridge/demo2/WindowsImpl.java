package design_pattern.structural_pattern.bridge.demo2;

/**
 * Windows操作系统实现类：具体实现类
 */
public class WindowsImpl implements ImageImpl {
    @Override
    public void doPaint(Matrix matrix) {
        //調用windows系統的绘制函数绘制像素矩阵
        System.out.println("在windows操作系统中显示图像");
    }
}
