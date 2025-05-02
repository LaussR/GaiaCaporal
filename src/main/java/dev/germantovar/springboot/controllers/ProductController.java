package dev.germantovar.springboot.controllers;
import dev.germantovar.springboot.repository.entities.Product;
import dev.germantovar.springboot.repository.ProductsRepository;
import dev.germantovar.springboot.services.IProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private IProductsService productsService;

    @Autowired
    private ProductsRepository productsRepository;

    @GetMapping("productos")
    public List<Product> getAll() {return productsService.getAll();}

}