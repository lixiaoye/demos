package design_pattern.structural_pattern.bridge.demo2;

/**
 * 抽象图像类：抽象类
 */
public abstract class Image {
    protected ImageImpl imageImpl;

    public void setImageImpl(ImageImpl imageImpl) {
        this.imageImpl = imageImpl;
    }

    public abstract void parseFile(String fileName);
}
