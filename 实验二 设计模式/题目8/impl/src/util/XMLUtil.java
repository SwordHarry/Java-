package util;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class XMLUtil {

    public static Object getBean(String args) {

        try {

            // 创建文档对象
            DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = dFactory.newDocumentBuilder();
            Document document = null;

            document = documentBuilder.parse(new File("src//util//config.xml"));

            NodeList nl = null;
            Node classNode = null;
            String cName = null;
            nl = document.getElementsByTagName("className");

            // 获取第一个包含类名的结点，即扩充抽象类
            if(args.equalsIgnoreCase("image")){
                classNode = nl.item(0).getFirstChild();
            }else if (args.equalsIgnoreCase("os")){
                classNode = nl.item(1).getFirstChild();
            }

            cName = classNode.getNodeValue();
            // 通过类名生成实例对象并将其返回
            Class c = Class.forName(cName);
            Object obj = c.newInstance();
            return obj;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }
}
