package com.coforge.demoproduct.controller;

import com.coforge.demoproduct.entity.Product;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class DempApplicationController {



    @GetMapping(value = "/getList")
    public ResponseEntity<List<Product>> getProductList(){
        List<Product> prodList=new ArrayList<Product>();
        Product prod=new Product();

        prod.setPid(1);
        prod.setName("Ankit");
        prod.setType("N");

        prodList.add(prod);

        return new ResponseEntity<>(prodList, HttpStatus.OK);


    }
}
