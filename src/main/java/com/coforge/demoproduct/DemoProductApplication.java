package com.coforge.demoproduct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(scanBasePackages = "com.coforge.*")
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class DemoProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoProductApplication.class, args);
    }

}
