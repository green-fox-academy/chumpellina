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

  /* @GetMapping("/reddit/add")
    public String main (){
        return "adder";
    }
    @PostMapping("/reddit/add")
    public String adder (@RequestParam String title, String link){
    Iterable<Post> postList = postService.add (title, link);
    return "redirect:/reddit";
    } */

}
