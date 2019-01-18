package design_pattern.structural_pattern.bridge.demo2;


/**
 * Created by LIXIAOYE on 2019/1/15.
 */

public class Client {
    public static void main(String[] args) {
        Image image;
        ImageImpl impl;
        image = (Image) XMLUtils.getBean("image");
        impl = (ImageImpl) XMLUtils.getBean("os");
        image.setImageImpl(impl);
        image.parseFile("hha");
    }
    /**
     在windows操作系统中显示图像
     hha,格式为JPG
     */
}
