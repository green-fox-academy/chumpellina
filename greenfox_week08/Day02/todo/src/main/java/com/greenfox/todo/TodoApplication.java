package com.greenfox.todo;

import com.greenfox.todo.models.Todo;
import com.greenfox.todo.models.User;
import com.greenfox.todo.repositories.TodoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodoApplication implements CommandLineRunner {
    TodoRepository todoRepository;
    Todo todo= new Todo("élj a mának, ne a mamának", false, false);
    Todo todo2= new Todo("ments a vízből katicákat", false, true);
    Todo todo3= new Todo("ne légy finnyás", true, false);
    Todo todo4= new Todo("együnk sötétet", false, true);
    Todo todo5= new Todo("éljük úgy ma mint a növények", true, false);
    Todo todo6= new Todo("mutass fityiszt a belvilágnak", true, false);
    Todo todo7= new Todo("keressünk a Marson közértet", false, false);

    public TodoApplication(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(TodoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        todoRepository.save(todo);
        todoRepository.save(todo2);
        todoRepository.save(todo3);
        todoRepository.save(todo4);
        todoRepository.save(todo5);
        todoRepository.save(todo6);
        todoRepository.save(todo7);
    }
}
