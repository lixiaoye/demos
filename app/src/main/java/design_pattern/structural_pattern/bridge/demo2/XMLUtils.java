package design_pattern.structural_pattern.bridge.demo2;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

/**
 * Created by LIXIAOYE on 2019/1/15.
 */
public class XMLUtils {
    /**
     * 该方法用于从xml配置文件中提取具体类类名，并返回一个实例对象
     *
     * @param args 类名
     * @return 实例对象
     */
    public static Object getBean(String args) {
        try {
            //创建文档对象
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse(new File(
                    "app\\src\\main\\java\\design_pattern\\structural_pattern\\bridge\\demo2\\config-bridge.xml"));
            NodeList nodeList = null;
            Node classNode = null;
            String cName = null;
            nodeList = doc.getElementsByTagName("className");
            if (args.equals("image")) {
                classNode = nodeList.item(0).getFirstChild();
            } else if (args.equals("os")) {
                classNode = nodeList.item(1).getFirstChild();
            }
            cName = classNode.getNodeValue();
            Class clazz = Class.forName(cName);
            Object obj = clazz.newInstance();
            return obj;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
