import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ReadInTodoList toDoList = new ReadInTodoList();
        TaskManipulations listToManipulate = new TaskManipulations();
        Task newTask = new Task(0, "Feed the monkey!", false);

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] inputParts = input.split(" ");



        if (inputParts[0] == null) {
            printUsage();
        }

        if (inputParts[0] == "l") {

            if (toDoList == null) {
                System.out.println("No todos for today! :)");
            } else
                listToManipulate.listTasks();
        }

        if (inputParts[0] == "a") {
            listToManipulate.addToList(newTask);
        }

        if (inputParts[0] == "r") {
            int removeId = Integer.parseInt(inputParts[1]);
            listToManipulate.remove(removeId);
        }

        if (inputParts[0] == "c") {
            int checkId = Integer.parseInt(inputParts[1]);
            listToManipulate.check(checkId);
        }

    }

    public static void printUsage() {
        System.out.println("Command Line Todo application\n" +
                "=============================\n" +
                "\n" +
                "Command line arguments:\n" +
                " -l   Lists all the tasks\n" +
                " -a   Adds a new task\n" +
                " -r   Removes an task\n" +
                " -c   Completes an task");
    }

    ;
}
