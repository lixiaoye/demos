package design_pattern.behavioral.visitor.demo4;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

/**
 * 为了提高系统的灵活性和可扩展性，我们将具体访问者类的类名存储在配置文件中，
 * 并通过工具类XMLUtil来读取配置文件并反射生成对象
 */

public class XMLUtil {
    /**
     * 该方法用于从xml配置文件中提取具体类类名，并返回一个实例对象
     */
    public static Object getBean() {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document;
            //java.io.FileNotFoundException: D:\work\Demos\config.xml (系统找不到指定的文件。)
            document = builder.parse(new File("app\\src\\main\\java\\design_pattern\\behavioral\\visitor\\demo4\\config.xml"));

            //获取包含类名的文本节点
            NodeList nodeList = document.getElementsByTagName("className");
            Node node = nodeList.item(0).getFirstChild();
            String cName = node.getNodeValue();

            //通过类名生成实例对象并将其返回
            Class clazz = Class.forName(cName);
            Object obj = clazz.newInstance();
            return obj;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
