import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;


public class PrintEachLine {
    public static void main(String[] args) {
        try {
            Path pathName = Paths.get("C:/Users/Zsófi/IdeaProjects/2PrintEachLine/my-file.txt");
            List<String> lines = Files.readAllLines(pathName);
            System.out.println(lines);


        } catch (IOException e) {
            System.out.println( "Unable to read file: my-file.txt");
        }
    }
}

