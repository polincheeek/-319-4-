package ru.neoflex.practice.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
@RestController
public class CalcController {
    @GetMapping("/plus/{a}/{b}")    public Integer Sum (@PathVariable ("a") Integer a,@PathVariable ("b") Integer b){
        return a+b;    }

    @GetMapping("/minus/{a}/{b}")
    public Integer Difference  (@PathVariable ("a") Integer a,@PathVariable ("b") Integer b){        return a-b;
    }}