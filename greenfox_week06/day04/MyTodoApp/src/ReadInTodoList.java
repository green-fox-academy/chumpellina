import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

// FILE BEOLVASÁSA

public class ReadInTodoList {
    Task task = new Task(6, "feed the monkey!", false);
    Path newList = Paths.get("WhatToDo.txt");
    List<Task> myToDoList = new ArrayList<>();

    public List<Task> myToDoList() {

        List<String> myStringList;
        try {
            myStringList = Files.readAllLines(newList);

            for (int i = 0; i < myStringList.size(); i++) {
                String[] parts = myStringList.get(i).split(";");
                Task taskToAdd = new Task((Integer.parseInt(parts[0])), parts[1], Boolean.parseBoolean(parts[2]));
                myToDoList().add(taskToAdd);
            }

        } catch (IOException e) {
            System.out.println("There is no such file, please provide a valid filename!");
        }

        return myToDoList;
    }


}
