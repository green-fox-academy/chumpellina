package com.greenfox.reddit.services;

import com.greenfox.reddit.models.Post;
import com.greenfox.reddit.repositories.PostRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {
    PostRepository postRepository;

    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public Iterable<Post> findAll() {
        return postRepository.findAll();
    }

    public void add(String title, String link) {
        postRepository.save(new Post (title, link));

    }
    public Post findById (Long id){
        Optional<Post> myPost = postRepository.findById(id);
        if (myPost.isPresent()==true){
           return myPost.get();
        }
        else throw new IllegalArgumentException();
    }

}


