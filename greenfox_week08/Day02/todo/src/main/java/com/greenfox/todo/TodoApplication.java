package com.greenfox.todo;

import com.greenfox.todo.models.User;
import com.greenfox.todo.repositories.TodoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodoApplication implements CommandLineRunner {
    private TodoRepository userRepository;

    public TodoApplication(TodoRepository userRepository) {
        this.userRepository = userRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(TodoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        User user = new User();
        user.setUsername("chumpellina");
        user.setAge(30);

        userRepository.save(user);
    }
}
