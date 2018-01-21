package co.edureka.xml;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class DOMXMLReader {

	public static void main(String[] args) {
		try {
			
			File file = new File("/Users/ishantkumar/Downloads/newstudents.xml");
			
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			
			Document document = builder.parse(file);
			
			System.out.println("Root Element: "+document.getDocumentElement().getNodeName());
			
			NodeList nodeList = document.getElementsByTagName("student");
			System.out.println("nodeList size is: "+nodeList.getLength());
			
			for(int i=0;i<nodeList.getLength();i++){
				Node node = nodeList.item(i);
				
				if(node.getNodeType() == Node.ELEMENT_NODE){
				
					Element element = (Element)node;
					
					System.out.println(element.getElementsByTagName("roll").item(0).getTextContent());
					System.out.println(element.getElementsByTagName("name").item(0).getTextContent());
					System.out.println(element.getElementsByTagName("age").item(0).getTextContent());
					System.out.println("******************");
				}
			}
			
		} catch (Exception e) {
			System.out.println("Some Error: "+e);
		}
		
	}

}
