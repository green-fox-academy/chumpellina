package com.greenfox.todo.controllers;

import com.greenfox.todo.models.Todo;
import com.greenfox.todo.repositories.TodoRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TodoController {
    private TodoRepository todoRepository;
    private Todo todo= new Todo("Vegyél kiflit", false, false);

    public TodoController(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @RequestMapping ("/")
    public void list(Model model){
        model.addAttribute("todos", todoRepository.findAll());
    }

    @RequestMapping ("todo")
    public String giveList (Model model){
        todoRepository.save(todo);
        return "todolist";
    }
}
