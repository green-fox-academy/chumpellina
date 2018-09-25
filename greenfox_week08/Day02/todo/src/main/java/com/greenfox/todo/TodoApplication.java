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
    Todo todo= new Todo("vegyél delfint", false, false);
    Todo todo2= new Todo("mennyél kocsmázni", false, false);
    Todo todo3= new Todo("utazz el a Holdra", false, false);
    Todo todo4= new Todo("legyél felelősségteljes", false, false);

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
    }
}
