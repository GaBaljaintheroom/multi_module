package com.example.multi_module_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = {"com.example.multi_module_database"})
@EnableJpaRepositories(basePackages = {"com.example.multi_module_database"})
public class MultiModuleApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(MultiModuleApiApplication.class, args);
    }

}
