package FactoryMethodPattern.code;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

/**
 * @Description 从xml文件中读取配置
 * @program DesignPatternLearn
 * @Author Peng Jiankun
 * @Date 2020-11-14 21:34
 **/
public class ReadXML {
    public static Object getOneObect(){
        try{
            DocumentBuilderFactory factory=DocumentBuilderFactory.newInstance();
            DocumentBuilder builder=factory.newDocumentBuilder();
            Document doc=builder.parse(new File(".\\src\\FactoryMethodPattern\\config.xml"));
            NodeList list=doc.getElementsByTagName("className");
            Node classNode=list.item(0).getFirstChild();
            String className="FactoryMethodPattern.code."+classNode.getNodeValue();
            Class<?> c=Class.forName(className);
            Object obj=c.newInstance();
            return obj;

        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
