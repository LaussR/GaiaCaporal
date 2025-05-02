package dev.germantovar.springboot.repository;
import dev.germantovar.springboot.repository.entities.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductsRepository extends CrudRepository<Product, Long> {
}
