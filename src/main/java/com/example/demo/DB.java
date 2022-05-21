package com.example.demo;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;
import java.util.stream.Collectors;

@Data
@NoArgsConstructor
public class DB {
    private String name;
    private Set<String> events;

    public DB(ListAffairs todoList) {
        this.name = todoList.getName();
        this.events = todoList.getEvents().stream().map(Event::getName).collect(Collectors.toSet());
    }
}
