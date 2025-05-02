package dev.germantovar.springboot.services;
import dev.germantovar.springboot.repository.entities.Product;
import java.util.List;

public interface IProductsService {
    List<Product> getAll();
}