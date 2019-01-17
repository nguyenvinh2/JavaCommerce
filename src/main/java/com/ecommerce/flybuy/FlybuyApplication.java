package com.ecommerce.flybuy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FlybuyApplication {

    public static void main(String[] args) {
        SpringApplication.run(FlybuyApplication.class, args);
        System.out.println("http://localhost:8080/");
    }

}

