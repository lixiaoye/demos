package design_pattern.creational.prototype.demo2;

/**
 * Created by LIXIAOYE on 2018/11/14.
 */

public class Client {
    public static void main(String[] args) {
        //1.构建文档对象
        WordDocument originDoc = new WordDocument();
        //2.编辑文档，添加图片等
        originDoc.setText("这是一篇文档");
        originDoc.addImage("图片1");
        originDoc.addImage("图片2");
        originDoc.addImage("图片3");
        originDoc.showDocument();

        //以原始文档为原型，拷贝一份副本
        WordDocument doc2 = originDoc.clone();
        doc2.showDocument();
        //修改文档副本，不会影响原始文档
        doc2.setText("这是修改过的Doc2文本");
        doc2.addImage("哈哈.jpg");
        doc2.showDocument();

        originDoc.showDocument();
    }
    /**
     the construct of WordDocument
     ---word content start---
     Text:这是一篇文档
     Images List:
     images name:图片1
     images name:图片2
     images name:图片3
     ---word content end----
     ---word content start---
     Text:这是一篇文档
     Images List:
     images name:图片1
     images name:图片2
     images name:图片3
     ---word content end----
     ---word content start---
     Text:这是修改过的Doc2文本
     Images List:
     images name:图片1
     images name:图片2
     images name:图片3
     images name:哈哈.jpg
     ---word content end----
     ---word content start---
     Text:这是一篇文档
     Images List:
     images name:图片1
     images name:图片2
     images name:图片3
     images name:哈哈.jpg
     ---word content end----
     */
}
