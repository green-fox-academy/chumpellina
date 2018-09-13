import java.util.ArrayList;
import java.util.List;

public class TaskManipulations {

    List <Task> myToDoList = new ArrayList<>();
    Task task = new Task(0, "blabla", false);

// TASKOK LISTÁZÁSA


    public void listTasks() {
        List<Task> printList = new ArrayList<>();
        for (int i = 0; i < myToDoList.size(); i++) {
            printList.add(myToDoList.get(i));
        }
        System.out.println(printList);
    }

    // TASKOK HOZZÁADÁSA

    public void addToList(Task newTask) {
        int maxId = 0;
        for (int i = 0; i < myToDoList.size(); i++) {
            while (myToDoList.get(i).getId() > maxId) {
                maxId = myToDoList.get(i).getId();
            }
        }
        newTask.setId(maxId);
        newTask.setCompleted(false);
        myToDoList.add(newTask);

    }

    // TASKOK TÖRLÉSE

    public void remove(int id) {
        myToDoList.remove(myToDoList.get(id));
    }

    // TASKOK ELVÉGZETT-JELZÉSE



    public String check(int id) {
        return String.format("%s - [%s] %s", task.getId(), signAsCompleted(), task.getTaskContent());
    }

    private String signAsCompleted() {
        if (task.getIsCompleted()== true) {
            return "X";
        }

        return " ";
    }

    private void setToCompleted(Task task) {
        task.setCompleted(true);
    }
}
