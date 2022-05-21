package com.example.demo;


import lombok.AllArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import java.util.Set;

@Validated
@RestController
@AllArgsConstructor
public class Controller {
    private final Service todoService;

    @PostMapping("/todo")
    public void addTodoList(@Valid @RequestBody DB todoList) {
        todoService.addTodo(todoList);
    }

    @GetMapping("/todo")
    public Set<DB> getTodos() {
        return todoService.getAll();
    }

    @GetMapping("/todo/{id}")
    public ListAffairs getTodo(@PathVariable @Min(1) Long id) {
        return todoService.getTodo(id);
    }
 }
