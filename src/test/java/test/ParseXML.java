package test;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class ParseXML {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
        File XMLFile = new File("C:\\Users\\SESA698287\\Desktop\\DeviceDescription.xml");
        DocumentBuilder documentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
        Document xmlDocument = documentBuilder.parse(XMLFile);


         // Getting the root element of the XML file
        Element rootElement = xmlDocument.getDocumentElement();
        System.out.println("Root Node Name is : "+rootElement.getNodeName());
        System.out.println("====================================================");

        // Printing the element child names which are under the root element
        if(rootElement.hasChildNodes()==rootElement.hasChildNodes()){
            NodeList rootNodeList = rootElement.getChildNodes();
           int rootChildCount = rootNodeList.getLength();
            System.out.println("Number of child count is : "+ rootChildCount);
            for (int i = 0; i<rootChildCount; i++){
                if(rootNodeList.item(i).getNodeType()==Node.ELEMENT_NODE){
                    System.out.println("========="+ rootNodeList.item(i).getNodeName()+"==========");

                    if(rootNodeList.item(i).hasChildNodes()==rootNodeList.item(i).hasChildNodes()){
                        NodeList child_Child_node_list = rootNodeList.item(i).getChildNodes();
                        int child_Child_count  = child_Child_node_list.getLength();

                        for (int j = 0; j<child_Child_count; j++){
                            if(child_Child_node_list.item(j).getNodeType()==Node.ELEMENT_NODE) {
                                String child_Child_node_name = String.valueOf(child_Child_node_list.item(j).getNodeName().equalsIgnoreCase("HMIVisibilityRules"));
                                String child_Child_node_values = child_Child_node_list.item(j).getTextContent();
                                System.out.println(child_Child_node_name + "====" + child_Child_node_values);
                            }
                        }
                    }
                }
            }
        }
    }
}
