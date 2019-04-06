package util;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;

public class XMLUtil {
    public static Object getBean() {
        Object object = null;
        try {
            // 创建 DOM 文档对象
            DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder =  dFactory.newDocumentBuilder();
            Document document = builder.parse(new File("src//util//config.xml"));

            // 获取包含类名的文本结点
            NodeList nl = document.getElementsByTagName("className");
            Node classNode = nl.item(0).getFirstChild();
            String cName = classNode.getNodeValue();

            // 通过类名生成实例对象并将其返回
            Class c = Class.forName(cName);
            object = c.newInstance();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return object;
    }
}
