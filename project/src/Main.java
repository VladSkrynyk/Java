import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;


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

    public static void test2() {

    }

    public static void main(String args[]) {

        if (args.length <= 1)
            System.out.println("Неправильний ввід\nПриклад: Ім'я програми аргумент1 аргумент2");

        if (args[0].equals("command1")) {

            String cmd1Args[] = Arrays.copyOfRange(args, 1, args.length);
            int result = TestCommand1.test(cmd1Args);
            System.out.println(result);

            if (result == 0)
                System.out.println("Програма виконалась успішно success");
        }
        else if (args[0].equals("command2")) {
            String cmd1Args[] = Arrays.copyOfRange(args, 1, args.length);
            System.out.println("start");
            TestCommand2.test(cmd1Args[0], cmd1Args[3], cmd1Args[1]);

            System.out.println("end");
        }
    }
}