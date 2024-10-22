package com.essoft.ELK_Demo.controller;

import com.essoft.ELK_Demo.dto.CustomerSaveDto;
import com.essoft.ELK_Demo.service.CustomerService;
import entity.Customer;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/customer")
public class CustomerController {

    private final CustomerService customerService;

    @PostMapping("/save")
    public ResponseEntity<Customer> save(@RequestBody CustomerSaveDto customerSaveDto) {
        return ResponseEntity.ok(customerService.save(customerSaveDto));
    }

    @GetMapping("/getAll")
    public ResponseEntity<Iterable<Customer>> getAll() {
        return ResponseEntity.ok(customerService.findAll());
    }
}
