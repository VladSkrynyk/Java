import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

//import commands.*;

public class Main {
    public static void test() {
        try {
            File fXmlFile = new File("d:/study/3 course/1 sem/java/project/Java/project/src/data/test.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(fXmlFile);
            doc.getDocumentElement().normalize();

            System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
            NodeList nList = doc.getElementsByTagName("runprog");
            System.out.println("----------------------------");

            for (int temp = 0; temp < nList.getLength(); temp++) {
                Node nNode = nList.item(temp);
                System.out.println("\nCurrent Element :" + nNode.getNodeName());
                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element eElement = (Element) nNode;
                    System.out.println("run prog with id : "
                            + eElement.getAttribute("id"));
                    System.out.println("command name : "
                            + eElement.getElementsByTagName("commandname")
                            .item(0).getTextContent());
                    System.out.println("parameter1 : "
                            + eElement.getElementsByTagName("parameter1")
                            .item(0).getTextContent());
                    System.out.println("parameter2 : "
                            + eElement.getElementsByTagName("parameter2")
                            .item(0).getTextContent());
                    System.out.println("parameter3 : "
                            + eElement.getElementsByTagName("parameter3")
                            .item(0).getTextContent());

                    if (eElement.getElementsByTagName("commandname").item(0).getTextContent().equals("cmd1")) {
                        String args[] = {eElement.getElementsByTagName("parameter1")
                                .item(0).getTextContent(),
                                eElement.getElementsByTagName("parameter2")
                                        .item(0).getTextContent(),
                                eElement.getElementsByTagName("parameter3")
                                        .item(0).getTextContent()
                        };
                        //Cmd1.main(args);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String args[]) {
        // test();

        Process process = null;
        try {
            System.out.println(Arrays.toString(args));
            process = Runtime.getRuntime().exec("ls");
        } catch (IOException e) {

            e.printStackTrace();
        }
    }
}