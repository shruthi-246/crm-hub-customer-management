package com.example.repository;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class CustomerRepository {

    private final JdbcTemplate jdbcTemplate;

    public CustomerRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    // Get all customers
    public List<Map<String, Object>> getAllCustomers() {
        String sql = "SELECT * FROM customers";
        return jdbcTemplate.queryForList(sql);
    }

    // Add a new customer
    public int addCustomer(Map<String, Object> customer) {
        String sql = "INSERT INTO customers (name, email, phone, address) VALUES (?, ?, ?, ?)";

        return jdbcTemplate.update(
                sql,
                customer.get("name"),
                customer.get("email"),
                customer.get("phone"),
                customer.get("address")
        );
    }

    // Update an existing customer
    public int updateCustomer(int id, Map<String, Object> customer) {
        String sql = "UPDATE customers SET name = ?, email = ?, phone = ?, address = ? WHERE customer_id = ?";

        return jdbcTemplate.update(
                sql,
                customer.get("name"),
                customer.get("email"),
                customer.get("phone"),
                customer.get("address"),
                id
        );
    }

    // Delete a customer
    public int deleteCustomer(int id) {
        String sql = "DELETE FROM customers WHERE customer_id = ?";
        return jdbcTemplate.update(sql, id);
    }
}