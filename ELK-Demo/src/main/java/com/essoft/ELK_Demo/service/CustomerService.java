package com.essoft.ELK_Demo.service;

import com.essoft.ELK_Demo.dto.CustomerSaveDto;
import com.essoft.ELK_Demo.repository.CustomerRepository;
import entity.Customer;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomerService {

    private final CustomerRepository customerRepository;


    public entity.Customer save(CustomerSaveDto customerSaveDto) {
        return customerRepository.save(
                entity.Customer.builder()
                        .name(customerSaveDto.getFirstName())
                        .surname(customerSaveDto.getLastName())
                        .fullName(customerSaveDto.getFirstName() + " " + customerSaveDto.getLastName())
                        .isActive(true)
                        .build()
        );
    }

    public Iterable<Customer> findAll() {
        return customerRepository.findAll();
    }
}
