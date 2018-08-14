import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class WriteSingleLine {

        public static void main(String[] args) {
            List<String> myName = new ArrayList();
            myName.add("Szabó Zsófia");
            try {
                Path filePath = Paths.get("C:/Users/Zsófi/IdeaProjects/4WriteSingleLine/my-file.txt");
                Files.write(filePath, myName);
            } catch (Exception e) {
                System.out.println("Unable to write file: my-file.txt");
            }
        }
    }
