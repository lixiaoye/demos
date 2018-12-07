package design_pattern.behavioral.command.demo6;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

/**
 * 为了提高系统的灵活性和可扩展性，可将具体命令类的类名存储在配置文件中，
 * 并通过工具类XMLUtil来读取配置文件并发射生成对象.
 */

public class XMLUtil {
    /**
     * 该方法用于从xml配置文件中提取具体类类名，并返回一个实例对象。
     * 可以通过参数的不同返回不同类名节点所对应的实例
     */
    public static Object getBean(int i) {
        //创建文档对象
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc;
            doc = builder.parse(new File(
                    "D:\\work\\Demos\\app\\src\\main\\java\\design_pattern\\behavioral\\command\\demo6\\config.xml"));
            //获取包含类名的文本节点
            NodeList nodeList = doc.getElementsByTagName("className");
            Node classNode = null;
            if (0 == i) {
                classNode = nodeList.item(0).getFirstChild();
            } else {
                classNode = nodeList.item(1).getFirstChild();
            }
            String cName = classNode.getNodeValue();
//            通过类名生成实例对象并将其返回
            Class clazz = Class.forName(cName);
            Object obj = clazz.newInstance();
            return obj;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
