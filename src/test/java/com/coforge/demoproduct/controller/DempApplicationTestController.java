package com.coforge.demoproduct.controller;


import com.coforge.demoproduct.entity.Product;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;

import java.util.Arrays;
import java.util.List;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class DempApplicationTestController {


    @Autowired
    TestRestTemplate restTemplate;

    @LocalServerPort
    private int port;


    @Test
    public void getAllProductList() {

        ResponseEntity<Product[]> responseProdList= restTemplate.getForEntity("http://localhost:"+port+"/getList", Product [].class);
        Assertions.assertEquals(200, ((ResponseEntity<?>) responseProdList).getStatusCode().value());

        List<Object> list= Arrays.asList(responseProdList.getBody());
        for (Object object : list) {
            System.out.println("Test Value:::::"+object.toString());
        }

    }
}
