package test;


import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class ReadXML {

    /**
     * Java DOM Parser [Built-in Java Library]
     * DocumentBuilderFactory
     * DocumentBuilder
     * Document
     */

    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {

        DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dFactory.newDocumentBuilder();
        Document document = dBuilder.parse("C:\\Users\\SESA698287\\Desktop\\DeviceDescription.xml");

        Element rootNode = document.getDocumentElement();


        NodeList nodeList = rootNode.getChildNodes();

        for(int i = 0; i<nodeList.getLength(); i++){
            Node node = nodeList.item(i);
            if(node.getNodeType()==Node.ELEMENT_NODE){
                Element element = (Element) node;
                String tagName  = element.getTagName();
                String contentText = element.getTextContent();
                System.out.println("This is TagName : "+tagName);
                System.out.println("This is Content  : "+contentText);
            }
        }
    }
}
