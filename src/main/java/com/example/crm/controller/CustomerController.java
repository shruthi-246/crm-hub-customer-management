package com.example.crm.controller;

import com.example.repository.CustomerRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class CustomerController {

    private final CustomerRepository customerRepository;

    public CustomerController(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    // Get all customers
    @GetMapping("/customers")
    public List<Map<String, Object>> getAllCustomers() {
        return customerRepository.getAllCustomers();
    }

    // Add a customer
    @PostMapping("/customers")
    public String addCustomer(@RequestBody Map<String, Object> customer) {
        customerRepository.addCustomer(customer);
        return "Customer added successfully";
    }

    // Update a customer
    @PutMapping("/customers/{id}")
    public String updateCustomer(
            @PathVariable int id,
            @RequestBody Map<String, Object> customer) {

        int rows = customerRepository.updateCustomer(id, customer);

        if (rows == 0) {
            throw new org.springframework.web.server.ResponseStatusException(
                    org.springframework.http.HttpStatus.NOT_FOUND,
                    "Customer not found");
        }

        return "Customer updated successfully";
    }

    // Delete a customer
    @DeleteMapping("/customers/{id}")
    public String deleteCustomer(@PathVariable int id) {
        int rows = customerRepository.deleteCustomer(id);

        if (rows == 0) {
            throw new org.springframework.web.server.ResponseStatusException(
                    org.springframework.http.HttpStatus.NOT_FOUND,
                    "Customer not found");
        }

        return "Customer deleted successfully";
    }
}