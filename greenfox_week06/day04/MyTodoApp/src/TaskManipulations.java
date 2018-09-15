import java.security.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import static java.time.temporal.ChronoUnit.HOURS;

public class TaskManipulations {
    ReadInTodoList toDoList = new ReadInTodoList();
    Task task = new Task();
    List<Task> taskList = toDoList.myToDoList();
    FileWriter fileWriter = new FileWriter();

// TASKOK LISTÁZÁSA


    public void listTasks() {
        if (taskList.size() == 0) {
            System.out.println("No todos today :)");
        }
        taskList.stream().forEach(task -> System.out.println(task));
    }
    // TASKOK HOZZÁADÁSA

    public void addToList(String arg) {

        int maxId = 0;
        for (int i = 0; i < taskList.size(); i++) {
            if (taskList.get(i).getId() > maxId) {
                maxId = taskList.get(i).getId();
            }
        }
        task = new Task(maxId+1, arg, false);
        taskList.add(task);
        //task.setCreatedAt();
    }

  // TASKOK TÖRLÉSE

    public void remove(int id) {

        taskList.remove(taskList.get(id));
    }

    // TASKOK ELVÉGZETT-JELZÉSE


    public void setToCompleted(int id) {
        taskList.get(id).setCompleted(true);
        taskList.get(id).setComplatedAt();
    }

    // TASK-LISTA ELMETÉSE
    private void save(List<Task> tasks) {
        fileWriter.

    }


    // LISTA KIPRINTELŐJE

    public List <String> printer() {
        List <String> listOfTasks = new ArrayList<>();
        for (int i = 0; i < taskList.size(); i++) {
           listOfTasks.add (String.format("%s - [%s] %s", taskList.get(i).getId(), taskList.get(i).getisCompleted(), taskList.get(i).getTaskContent()));
        }
        return listOfTasks;
    }
    }


