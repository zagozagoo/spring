package com.bosch.example.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.bosch.example.dto.User;

@RestController
public class TestController {
    
    // @GetMapping("/test")
    // public Integer test(Integer a, Integer b) {
    //     return a + b;
    // }
    // //ai no get passa -> localhost:8080/test?a=3&b=2

    // @GetMapping("/test/{a}/{b}")
    // public Integer test(
    //     @PathVariable Integer a,
    //     @PathVariable Integer b) {
    //     return a + b;
    // }
    // //ai no get passa -> localhost:8080/test/3/2

    @GetMapping("/test")
    public String test(@RequestBody User user) {
        if (user.name() == null) {
            throw new ResponseStatusException(
                HttpStatus.BAD_REQUEST, "Name is missing."
            );
        }
        return user.name();
    }
}