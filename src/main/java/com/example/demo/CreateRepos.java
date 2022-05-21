package com.example.demo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface CreateRepos extends CrudRepository<ListAffairs, Long> {
    Set<ListAffairs> findAll();
    ListAffairs getTodoListById(Long id);
}
