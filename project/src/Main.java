import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;

import commands.*;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.File;
import java.io.IOException;


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
        try {
            // Create a ProcessBuilder for the system command
            ProcessBuilder processBuilder = new ProcessBuilder("cmd.exe", "/c", "ls");

            // Start the process
            Process process = processBuilder.start();

            // Read the output of the command
            java.io.InputStream is = process.getInputStream();
            java.util.Scanner s = new java.util.Scanner(is).useDelimiter("\\A");
            String output = s.hasNext() ? s.next() : "";

            // Print the output
            System.out.println("Command output:");
            System.out.println(output);

            // Wait for the process to complete
            process.waitFor();

            // Get the exit code
            int exitCode = process.exitValue();
            System.out.println("Exit Code: " + exitCode);

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String args[]) {
        // test();

        // test2();

        Cmd1.runWithDelay();

    }
}