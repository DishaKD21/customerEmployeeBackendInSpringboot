package com.employeeManagement.repository;

import org.springframework.data.repository.CrudRepository;

import com.employeeManagement.entity.Customer;

public interface CustomerRespository extends CrudRepository<Customer, Integer> {
}
