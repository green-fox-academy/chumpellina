package com.greenfox.reddit.controllers;

import com.greenfox.reddit.models.Post;
import com.greenfox.reddit.repositories.PostRepository;
import com.greenfox.reddit.services.PostService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
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
        return "redirect:/reddit/add";
    }

    @PostMapping("/reddit/pluscounter")
    public String adder(@RequestParam Long id, String name) {
        Post myPost = postService.findById(id);
        myPost.setScore(myPost.getScore() + 1);
        return "redirect:/reddit";
    }

    @PostMapping("/reddit/minuscounter")
    public String substract(@RequestParam Long id, String name) {
        Post myPost = postService.findById(id);
        myPost.setScore(myPost.getScore() - 1);
        return "redirect:/reddit";
    }
}


