import commands.Cmd3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class TestCommand3 {
    public static int test(String args[]) {
        try {
            for (String file : args) {
                Cmd3.mainProgramme(file);
            }

            return 0;
        } catch (Exception e) {
            return -1;
        }

    }
    public static void main(String args[]) {

    }
}




