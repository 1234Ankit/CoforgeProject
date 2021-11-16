package com.coforge.demoproduct.service;

import com.coforge.demoproduct.entity.Product;
import com.coforge.demoproduct.repository.ProductRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

public class ProductServiceTest {

    private ProductRepository productRepository;
    private ProductService productService;


    @Test
    public  void getProductTests() {
        productRepository = Mockito.mock(ProductRepository.class);
        productService = new ProductServiceImpl(productRepository);
        List<Product> products = new ArrayList<Product>();
        List<Product> produts = new ArrayList<>();
        Product product = new Product();
        product.setType("S");
        produts.add(product);
        product = new Product();
        product.setType("N");
        produts.add(product);

        Mockito.when(productRepository.findAll()).thenReturn(produts);
        Assertions.assertEquals(1, productService.getProduct().size());


    }
}
