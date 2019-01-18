package design_pattern.structural_pattern.bridge.demo2;

/**
 * GIF格式图像：扩充抽象类
 */
public class GIFImage extends Image {
    @Override
    public void parseFile(String fileName) {
        Matrix matrix = new Matrix();
        imageImpl.doPaint(matrix);
        System.out.println(fileName + ",格式为GIF");
    }
}
