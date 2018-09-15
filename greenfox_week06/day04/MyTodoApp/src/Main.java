import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        TaskManipulations listToManipulate = new TaskManipulations();
        //Task newTask = new Task();

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] inputParts = input.split(";");


      if (inputParts[0].equals(null)) {
            printUsage();
        }

        if (inputParts[0].equals("l")) {
            listToManipulate.listTasks();
        }

        if (inputParts[0].equals("a")) {
            listToManipulate.addToList(inputParts[1]);
        }

      if (inputParts[0].equals("r")) {
            int removeId = Integer.parseInt(inputParts[1]);
            listToManipulate.remove(removeId);
        }

       if (inputParts[0].equals("c")) {
            int checkId = Integer.parseInt(inputParts[1]);
            listToManipulate.setToCompleted(checkId);
            //newTask.completionTime(newTask.getCreatedAt(), newTask.getCompletedAt());
        }
        System.out.println(listToManipulate.printer());
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


    }


