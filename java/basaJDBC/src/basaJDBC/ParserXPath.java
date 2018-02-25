package basaJDBC;

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

	public static String nameFile;
	public static String ruleCase;
   
	public static String getNameFile() {
		return nameFile;
	}

	public static void setNameFile(String nameFile) {
		ParserXPath.nameFile = nameFile ;
	}

	public static String getRuleCase() {
		return ruleCase;
	}

	public static void setRuleCase(String ruleCase) {
		ParserXPath.ruleCase = ruleCase;
	}

	public  ParserXPath(String rule,String name) throws XPathExpressionException, FileNotFoundException {
		
				setRuleCase(rule);
				setNameFile(name);
				XPathFactory xpf = XPathFactory.newInstance();
				XPath xPath = xpf.newXPath();//������������ ������
				XPathExpression expr =  xPath.compile(getRuleCase());
				NodeList nodes = (NodeList)(expr.evaluate(new InputSource(getNameFile()),XPathConstants.NODESET)); 
				for(int i=0;i<nodes.getLength();i++) {
					System.out.println(nodes.item(i).getNodeValue());
				}
		
		
	}

}