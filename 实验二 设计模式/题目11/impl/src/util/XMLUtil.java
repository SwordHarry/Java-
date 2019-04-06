package util;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class XMLUtil {

    public static Object getBean(){

        try {
            DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dFactory.newDocumentBuilder();
            Document document = builder.parse(new File("src//util//config.xml"));

            NodeList nl = document.getElementsByTagName("className");
            Node node = nl.item(0).getFirstChild();
            String cName = node.getNodeValue();

            Class c = Class.forName(cName);
            Object obj = c.newInstance();
            return obj;


        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }
}
