/*
Copyright 2010 kiddy
*/
package other;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class XPathDemo {
	
	public static void main(String[] args) throws ParserConfigurationException,
		SAXException, IOException, XPathExpressionException
	{
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		dbf.setNamespaceAware(true);
		DocumentBuilder db = dbf.newDocumentBuilder();
		Document doc = db.parse(new File("books.xml"));
		XPathFactory xpf = XPathFactory.newInstance();
		XPath xpth = xpf.newXPath();
		XPathExpression expression = 
				xpth.compile("//book[@category='WEB']/title/text()");
		Object result = expression.evaluate(doc, XPathConstants.NODESET);
		NodeList list = (NodeList)result;
		for(int i=0; i < list.getLength(); i++) {
			System.out.println(list.item(i).getNodeValue());
		}
		
	}

}
