package com.apress.todo.repository;

import com.apress.todo.domain.ToDo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

@RepositoryRestResource
public interface ToDoRepository extends CrudRepository<ToDo,String> {}