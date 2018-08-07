public class ToDoPrint {
    public static void main(String... args) {

        String todoText = " - Buy milk\n";
        String todo = "My todo:\n";
        String todoText2 = " - Download games\n\t";
        String todoText3 = " - Diablo";
        todoText = todo.concat(todoText);
        todoText = todoText.concat(todoText2);
        todoText = todoText.concat(todoText3);
        System.out.println(todoText);
    }
}

