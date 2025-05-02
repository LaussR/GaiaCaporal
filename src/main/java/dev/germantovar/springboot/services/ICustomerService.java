package dev.germantovar.springboot.services;
import dev.germantovar.springboot.repository.entities.Customer;
import java.util.List;

public interface ICustomerService {
    List<Customer> getAll();

}

