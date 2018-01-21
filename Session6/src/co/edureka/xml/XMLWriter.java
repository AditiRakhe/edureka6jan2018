package co.edureka.xml;

import java.io.File;
import java.io.FileOutputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

public class XMLWriter {

	public static void main(String[] args) {
		
		try {
			
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document document = builder.newDocument(); // XML Document in Java
			
			Element rootElm = document.createElement("students");
			
			Element stuElm = document.createElement("student");
			
			Element rollElm = document.createElement("roll");
			Element nameElm = document.createElement("name");
			Element ageElm = document.createElement("age");
			
			Text rollTxt = document.createTextNode("101");
			Text nameTxt = document.createTextNode("John");
			Text ageTxt = document.createTextNode("20");
			
			
			rollElm.appendChild(rollTxt);
			nameElm.appendChild(nameTxt);
			ageElm.appendChild(ageTxt);
			
			stuElm.appendChild(rollElm);
			stuElm.appendChild(nameElm);
			stuElm.appendChild(ageElm);
			
			rootElm.appendChild(stuElm);
			
			document.appendChild(rootElm);
			
			// Source
			DOMSource source = new DOMSource(document);
			
			// StreamResult
			File file = new File("/Users/ishantkumar/Downloads/newstudents.xml");
			FileOutputStream fos = new FileOutputStream(file); 
			StreamResult result = new StreamResult(fos);
			
			// Transformer
			TransformerFactory tFactory = TransformerFactory.newInstance();
			Transformer transformer = tFactory.newTransformer();
			
			//Transformer transformer = TransformerFactory.newInstance().newTransformer();
			
			transformer.transform(source, result);
			
			System.out.println("XML file "+file.getName()+" generated successfully!!");
			
		} catch (Exception e) {
			System.out.println("Some Error: "+e);
		}

	}

}
