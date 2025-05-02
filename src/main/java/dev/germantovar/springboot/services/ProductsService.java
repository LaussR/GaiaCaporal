package dev.germantovar.springboot.services;
import dev.germantovar.springboot.repository.entities.Product;
import dev.germantovar.springboot.repository.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductsService implements IProductsService{

    @Autowired
    private ProductsRepository productsRepository;

    @Override
    public List<Product> getAll() {
        return (List<Product>) productsRepository.findAll();
    }
}