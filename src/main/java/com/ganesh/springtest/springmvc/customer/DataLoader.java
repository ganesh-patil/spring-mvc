package com.ganesh.springtest.springmvc.customer;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class DataLoader {

    @Bean
    public CommandLineRunner loadData(CustomerRepository repository) {
        return (args) -> {
            repository.save(new Customer(1, "Ganesh"));
            repository.save(new Customer(2, "John"));
        };
    }
}
