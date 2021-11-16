package com.coforge.demoproduct.service;

import com.coforge.demoproduct.entity.Product;
import com.coforge.demoproduct.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProductServiceImpl implements ProductService{

    private final ProductRepository productRepository;
    @Override
    public List<Product> getProduct() {
        return null;
    }
}
