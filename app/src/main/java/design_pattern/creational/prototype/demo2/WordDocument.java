package design_pattern.creational.prototype.demo2;

import java.util.ArrayList;

/**
 * 文档类型：ConcretePrototype角色；
 * Cloneable：prototype角色
 * clone()为Object中的方法；Cloneable也是一个标识接口，表明这个类的对象是可拷贝的；
 * 如果没有实现Cloneable接口却调用了clone()方法将抛异常
 */

public class WordDocument implements Cloneable {
    private String mText;//文本
    //图片名列表
    private ArrayList<String> mImages = new ArrayList<String>();

    public WordDocument() {
        System.out.println("the construct of WordDocument");
    }

    public String getText() {
        return mText;
    }

    public void setText(String mText) {
        this.mText = mText;
    }

    public ArrayList<String> getImages() {
        return mImages;
    }

    public void setImages(ArrayList<String> mImages) {
        this.mImages = mImages;
    }

    public void addImage(String img) {
        this.mImages.add(img);
    }

    /**
     * 实现对象克隆
     *
     * @return WordDocument
     */
    @Override
    protected WordDocument clone() {
        try {
            WordDocument doc = (WordDocument) super.clone();
            doc.mText = this.mText;
            //对mImages对象也调用clone()函数，进行深拷贝
            //將doc.mImages指向this.mImages的一份拷貝，而不是this.mImages本身
            doc.mImages = (ArrayList<String>) this.mImages.clone();
            return doc;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public void showDocument() {
        System.out.println("---word content start---");
        System.out.println("Text:" + mText);
        System.out.println("Images List:");
        for (String imgName : mImages) {
            System.out.println("images name:" + imgName);
        }
        System.out.println("---word content end----");
    }
}
