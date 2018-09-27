package com.greenfox.todo.repositories;

import com.greenfox.todo.models.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TodoRepository extends CrudRepository <Todo, Long> {
    List<Todo> findAllByTitle (String name);
}
