package com.essoft.ELK_Demo.repository;

import entity.Customer;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface CustomerRepository extends ElasticsearchRepository<Customer, String> {
    Iterable<Customer> findByLastName(String lastName);
}
