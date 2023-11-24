import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;

import commands.Cmd3;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.File;
import java.util.Arrays;

/**
 * Головна програма Main.java
 * Запускає тести всіх завдань відповідно до користувацького вводу.
 *
 * @author Vlad Skrynyk
 */
public class Main {
    public static void readFromFile() {
        try {
            File fXmlFile = new File("d:/study/3 course/1 sem/java/project/Java/project/src/data/file.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(fXmlFile);
            doc.getDocumentElement().normalize();

            System.out.println("Read from file.xml :" + doc.getDocumentElement().getNodeName());
            NodeList nList = doc.getElementsByTagName("runprog");
            System.out.println("----------------------------");

            for (int temp = 0; temp < nList.getLength(); temp++) {
                Node nNode = nList.item(temp);

                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element eElement = (Element) nNode;
                    String cmdName = eElement.getElementsByTagName("commandname").item(0).getTextContent();

                    if (cmdName.equals("cmd1")) {
                        String cmd1Args[] = {eElement.getElementsByTagName("parameter1")
                                .item(0).getTextContent()
                        };
                        int result = TestCommand1.test(cmd1Args);
                        System.out.println(result);

                        if (result == 0)
                            System.out.println("Програма виконалась успішно");
                    }
                    else if (cmdName.equals("cmd2")) {
                        String cmd2Args[] = {
                                eElement.getElementsByTagName("parameter1").item(0).getTextContent(),
                                eElement.getElementsByTagName("parameter2").item(0).getTextContent(),
                                eElement.getElementsByTagName("parameter3").item(0).getTextContent(),
                        };

                        TestCommand2.test(cmd2Args[0], cmd2Args[1], cmd2Args[2]);
                    }
                    else if (cmdName.equals("cmd3")) {
                        String cmd3Args[] = {
                                eElement.getElementsByTagName("parameter1").item(0).getTextContent(),
                                eElement.getElementsByTagName("parameter2").item(0).getTextContent(),
                                eElement.getElementsByTagName("parameter3").item(0).getTextContent(),
                        };

                        TestCommand3.test(cmd3Args);
                    }
                    else if (cmdName.equals("cmd4")) {
                        String cmd4Args[] = {
                                eElement.getElementsByTagName("parameter1").item(0).getTextContent(),
                        };

                        TestCommand4.test(cmd4Args);
                    }

                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String args[]) {


         if ((args.length == 1) && (args[0].equals("command1")))
            System.out.println("Неправильний ввід\nПриклад: Ім'я програми аргумент1 аргумент2");

         if (args[0].equals("jobs")) {
             String cmdArgs[] = Arrays.copyOfRange(args, 1, args.length);
             Cmd3.jobs(cmdArgs);

             return;
         }

        if (args[0].equals("command1")) {

            String cmd1Args[] = Arrays.copyOfRange(args, 1, args.length);
            int result = TestCommand1.test(cmd1Args);
            System.out.println(result);

            if (result == 0)
                System.out.println("Програма виконалась успішно");
        }
        else if (args[0].equals("command2")) {
            String cmd1Args[] = Arrays.copyOfRange(args, 1, args.length);

            TestCommand2.test(cmd1Args[0], cmd1Args[3], cmd1Args[1]);
        }
        else if(args[0].equals("command3")) {
            String cmd3Args[] = Arrays.copyOfRange(args, 1, args.length);

            TestCommand3.test(cmd3Args);
        }
        else if (args[0].equals("command4")) {
            String cmd4Args[] = Arrays.copyOfRange(args, 1, args.length);

            TestCommand4.test(cmd4Args);
        }
        else if (args[0].equals("readfromfile")){
            readFromFile();
        }
        else {
            System.out.println("Неправильний ввід\nДоступні команди: command1, command2, command3, command4");
        }
    }
}