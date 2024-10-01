package test;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class XMLRead {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {

        DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dFactory.newDocumentBuilder();
        Document document = dBuilder.parse("C:\\Users\\SESA698287\\Desktop\\DeviceDescription.xml");

        Element rootNode = document.getDocumentElement();
        System.out.println("Root node text : " + rootNode.TEXT_NODE);
        System.out.println("Root node attribute : " + rootNode.ATTRIBUTE_NODE);
        System.out.println("Root Node tag Name :" + rootNode.getTagName());
        NodeList nodeList = rootNode.getChildNodes();


        System.out.println("1st Child Node Length : " + rootNode.getChildNodes().getLength());
        System.out.println("2nd Child Node Length : " +nodeList.getLength());

        for (int i = 0; i < nodeList.getLength(); i++) {
            System.out.println("Child Node tag Name : " + rootNode.getChildNodes().item(i));

        }
    }
}
