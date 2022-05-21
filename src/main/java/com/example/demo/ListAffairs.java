package com.example.demo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@Table(name = "todo")
@EqualsAndHashCode(exclude = "events")
@NoArgsConstructor
public class ListAffairs {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty
    @Size(max = 50)
    private String name;

    @OneToMany(mappedBy = "todoList", cascade = {CascadeType.ALL})
    private Set<Event> events = new HashSet<>();
}
