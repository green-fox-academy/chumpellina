package com.greenfox.todo.services;
import com.greenfox.todo.models.User;
import com.greenfox.todo.repositories.TodoRepository;
import org.springframework.stereotype.Service;

@Service
public class TodoService {
    private TodoRepository todoRepository;

    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

}
