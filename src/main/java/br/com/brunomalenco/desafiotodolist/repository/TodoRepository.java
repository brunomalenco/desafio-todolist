package br.com.brunomalenco.desafiotodolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.brunomalenco.desafiotodolist.entitiy.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long>{
    
}
