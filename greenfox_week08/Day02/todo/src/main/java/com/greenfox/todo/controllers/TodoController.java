package com.greenfox.todo.controllers;

import com.greenfox.todo.models.Assignee;
import com.greenfox.todo.models.Todo;
import com.greenfox.todo.repositories.TodoRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class TodoController {
    private TodoRepository todoRepository;

    public TodoController(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @RequestMapping(value = {"/"})
    public String list(Model model) {
        model.addAttribute("todos", todoRepository.findAll());
        return "todolist";
    }

    @RequestMapping("/todo")
    public String listActives(Model model, @RequestParam String isActive) {
        model.addAttribute("todos", todoRepository.findAll());
        model.addAttribute("isActive", isActive);
        return "activetodolist";
    }

    @GetMapping("/todo/add")
    public String listGet() {
        return "todoadd";
    }

    @PostMapping("/todo/add")
    public String listPost(@RequestParam String name) {
        Todo todo = new Todo(name);
        todoRepository.save(todo);
        return "redirect:/";
    }

    @PostMapping("/{id}/delete")
    public String delete ( @PathVariable long id){
        todoRepository.deleteById(id);
        return"redirect:/";
    }

    @PostMapping ("/{id}/edit")
    public String edit (@PathVariable Long id, Model model) {
        Todo todo = todoRepository.findById(id).get();
        model.addAttribute("urgent", todo.isUrgent());
        model.addAttribute("done", todo.isDone());

        return "todoedit";
    }

    @GetMapping("/search")
    public String search (Model model, String search) {

        model.addAttribute("findings", todoRepository.findAllByTitle(search));
        return "search";
    }

    @GetMapping("/assignee")
    public String assigneeLister (Model model, String name) {
        return "assigneelist";
    }
}
