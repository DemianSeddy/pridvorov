package xml_parser;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathException;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

public class ParserXPath {

	public static void main(String[] args) throws XPathExpressionException, FileNotFoundException {
		XPathFactory xpf = XPathFactory.newInstance();
		XPath xPath = xpf.newXPath();//активировали парсер
		XPathExpression expr =  xPath.compile("//regdriver/text()");
		NodeList nodes = (NodeList)(expr.evaluate(new InputSource("basesetting.xml"),XPathConstants.NODESET)); 
		for(int i=0;i<nodes.getLength();i++) {
			System.out.println(nodes.item(i).getNodeValue());
		}
		
	}

}
