package basaJDBC;

import java.io.FileNotFoundException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
 
public class ParserXPATH {
	
	public static String nameFile;
	public static String ruleCase;
	public static String parametr;
   
	public static String getNameFile() {
		return nameFile;
	}

	public static void setNameFile(String nameFile) {
		ParserXPATH.nameFile = nameFile ;
	}

	public static String getRuleCase() {
		return ruleCase;
	}

	public static void setRuleCase(String ruleCase) {
		ParserXPATH.ruleCase = ruleCase;
	}
	
	public static String getParametr() {
		return parametr;
	}

	public static void setParametr(String parametr) {
		ParserXPATH.parametr = parametr;
	}
	
	public ParserXPATH(String rule,String name) throws XPathExpressionException, FileNotFoundException {
		setRuleCase(rule);
		setNameFile(name);
		XPathFactory xpf = XPathFactory.newInstance();
		XPath xPath = xpf.newXPath();//активировали парсер
		XPathExpression expr =  xPath.compile(getRuleCase());
		NodeList nodes = (NodeList)(expr.evaluate(new InputSource(getNameFile()),XPathConstants.NODESET));
		String parameter="";
		for(int i=0;i<nodes.getLength();i++) {
			setParametr(nodes.item(i).getNodeValue());
			System.out.println(nodes.item(i).getNodeValue());
		}
	}

	
	}
