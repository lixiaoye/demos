package design_pattern.behavioral.strategy.demo2.after;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

/**
 * Created by LIXIAOYE on 2018/12/24.
 */

public class XMLUtil {
    public static Object getBean() {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = null;
        try {
            builder = factory.newDocumentBuilder();
            Document doc = builder.parse(new File("app\\src\\main\\java\\design_pattern\\behavioral\\strategy\\demo2\\after\\config.xml"));

            //获取包含类名的文本节点
            NodeList nodeList = doc.getElementsByTagName("className");
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
