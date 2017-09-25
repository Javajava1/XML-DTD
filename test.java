package xml;

import java.io.FileNotFoundException;  
import java.io.IOException;  
  
import javax.xml.parsers.DocumentBuilder;  
import javax.xml.parsers.DocumentBuilderFactory;  
import javax.xml.parsers.ParserConfigurationException;  
  
import org.xml.sax.SAXException;  
  
public class test {  
      
    public static void main(String[] args) {  
        System.out.println("测试符合DTD规范的XML文件");  
        testPerson();  
          
//        System.out.println("测试不符合DTD规范的XML文件");  
//        testWorkder();  
          
    }  
      
    public static void testPerson() {  
        try {  
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();  
            dbf.setValidating(true);  
            DocumentBuilder db = dbf.newDocumentBuilder();  
            db.parse(new java.io.FileInputStream("C:/Users/zhao/Desktop/person.xml"));  
        } catch (FileNotFoundException e) {  
            // TODO Auto-generated catch block  
            e.printStackTrace();  
        } catch (ParserConfigurationException e) {  
            // TODO Auto-generated catch block  
            e.printStackTrace();  
        } catch (SAXException e) {  
            // TODO Auto-generated catch block  
            e.printStackTrace();  
        } catch (IOException e) {  
            // TODO Auto-generated catch block  
            e.printStackTrace();  
        }  
    }  
      
//    public static void testWorkder() {  
//        try {  
//            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();  
//            dbf.setValidating(true);  
//            DocumentBuilder db = dbf.newDocumentBuilder();  
//            db.parse(new java.io.FileInputStream("worker.xml"));  
//        } catch (FileNotFoundException e) {  
//            // TODO Auto-generated catch block  
//            e.printStackTrace();  
//        } catch (ParserConfigurationException e) {  
//            // TODO Auto-generated catch block  
//            e.printStackTrace();  
//        } catch (SAXException e) {  
//            // TODO Auto-generated catch block  
//            e.printStackTrace();  
//        } catch (IOException e) {  
//            // TODO Auto-generated catch block  
//            e.printStackTrace();  
//        }  
//    }  
}  
