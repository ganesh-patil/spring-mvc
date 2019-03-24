package com.ganesh.springtest.springmvc.customer;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class CustomerController {

    @Autowired
    private CustomerRepository customerRepository;

    @GetMapping({"/", "/customer"})
    public String customers(Model model) {
        List<Customer>  customers = customerRepository.findAll();
        model.addAttribute("customers", customers.toString());
        return "customer";
    }
}
