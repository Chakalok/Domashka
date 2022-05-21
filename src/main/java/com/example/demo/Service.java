package com.example.demo;


import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.Set;
import java.util.stream.Collectors;

@org.springframework.stereotype.Service
@AllArgsConstructor
@Slf4j
public class Service {
    private final CreateRepos repos;

    public Set<DB> getAll() {

        Set<ListAffairs> todoLists = repos.findAll();
        return todoLists.stream().map(DB::new).collect(Collectors.toSet());

    }

    public void addTodo(DB todoList) {

        ListAffairs todo = new ListAffairs();
        todo.setName(todoList.getName());
        Set<Event> events = todoList.getEvents().stream()
                .map(x -> new Event(x, todo)).collect(Collectors.toSet());
        todo.setEvents(events);
        repos.save(todo);

    }

    public ListAffairs getTodo(Long id) {

        return repos.getTodoListById(id);
        
    }
}
