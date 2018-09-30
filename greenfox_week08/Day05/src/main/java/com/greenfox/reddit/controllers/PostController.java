package com.greenfox.reddit.controllers;

import com.greenfox.reddit.models.Post;
import com.greenfox.reddit.repositories.PostRepository;
import com.greenfox.reddit.services.PostService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class PostController {
    private PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping("/reddit")
    public String main(Model model) {
        Iterable<Post> postList = postService.findAll();
        model.addAttribute("posts", postList);
        return "main";
    }

    @GetMapping("/reddit/add")
    public String main() {
        return "adder";
    }

    @PostMapping("/reddit/add")
    public String postAdder(@RequestParam String title, String link) {
        postService.add(title, link);
        return "redirect:/reddit";
    }

    @PostMapping("/reddit/pluscounter/{id}")
    public String adder(@PathVariable Long id) {
        postService.addOne(id);
        return "redirect:/reddit";
    }

    @PostMapping("/reddit/minuscounter/{id}")
    public String substract(@PathVariable Long id) {
        postService.minusOne(id);
        return "redirect:/reddit";
    }
}


