package com.k4h4shi.todoRestApiServer.domain;

import org.springframework.data.repository.PagingAndSortingRepository;

public interface TodoRepository extends PagingAndSortingRepository<Todo, Long> {

}
