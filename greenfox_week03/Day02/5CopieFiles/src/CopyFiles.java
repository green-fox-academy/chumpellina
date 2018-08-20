import java.io.BufferedWriter;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CopyFiles {
    public static void main(String[] args) {
        Path myText = Paths.get("myText.txt");
        System.out.println(copyFile(myText));
    }

    public static Path copyFile(Path originalFile) {
        originalFile = Paths.get("myText.txt");
        Path myText2 = Paths.get("myText2.txt");
        try {

            Files.copy(Paths.get(String.valueOf(originalFile)), Paths.get(String.valueOf(myText2)));
        }
        catch (Exception e){
            System.out.println("Sorry, the file does not exist");

        }
        return myText2;
    }
}
