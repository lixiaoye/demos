package design_pattern.structural_pattern.bridge.demo2;

/**
 * JPG格式图像：扩充抽象类
 */
public class JPGImage extends Image {
    @Override
    public void parseFile(String fileName) {
        //模拟解析jpg文件并获得一个像素矩阵对象matrix
        Matrix matrix = new Matrix();
        imageImpl.doPaint(matrix);
        System.out.println(fileName + ",格式为JPG");
    }
}
