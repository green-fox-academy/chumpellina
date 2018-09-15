import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileWriter {
    Path file = Paths.get("src/WhatToDo.txt");


    public void writeToFile () {
        List<Task> lines;
        {
            try {
                Files.write(file, (Iterable<? extends CharSequence>) ???);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
