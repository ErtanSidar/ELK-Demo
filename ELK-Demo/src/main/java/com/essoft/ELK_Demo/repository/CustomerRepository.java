package com.essoft.ELK_Demo.repository;

import entity.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.annotations.Query;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.scheduling.annotation.Async;

import java.util.List;
import java.util.concurrent.Future;
import java.util.stream.Stream;

public interface CustomerRepository extends ElasticsearchRepository<Customer, String> {
    Iterable<Customer> findByLastName(String lastName);

    List<Customer> findAllByNameAndSurname(String name, String surname);

    @Query("select c from Customer c")
    Stream<Customer> findAllCustomerStream();

    Page<Customer> findAllByNameLike(String name, Pageable pageable);

    @Async
    Future<Customer> findAllByName(String name);

    Page<Customer> findAllByNameContaining(String name, Pageable pageable);
}
