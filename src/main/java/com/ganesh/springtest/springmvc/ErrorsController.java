package com.ganesh.springtest.springmvc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ErrorsController {

    @GetMapping
    public String error(Error error){

        return "Error";
    }
}
