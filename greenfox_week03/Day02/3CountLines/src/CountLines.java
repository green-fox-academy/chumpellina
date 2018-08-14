import javafx.scene.shape.Path;

import java.io.*;
import java.util.Scanner;
import java.nio.file.Paths;
import java.nio.file.Files;


public class CountLines {
    public static void main(String[] args) {
        File file = new File("C:/Users/Zsófi/IdeaProjects/3CountLines/SpecialText.txt");
        System.out.println(counter (file));
    }

        public static int counter (File file){
            int numberOfLines = 0;
            try {
                FileReader fileReader = new FileReader(file);
                LineNumberReader numberReader = new LineNumberReader(fileReader);


                while (numberReader.readLine() != null) {
                    numberOfLines++;
                }




            } catch (IOException e) {
            System.out.println(0);

            }

        return numberOfLines;
        }
}


// Write a function that takes a filename as string,
// then returns the number of lines the file contains.
// It should return zero if it can't open the file, and
// should not raise any error.