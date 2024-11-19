package com.demo.product.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {


    @GetMapping("/product")
    public String getProduct()
    {
        return "maggi";
    }

    @PostMapping("/setproduct")
    public String setProduct(@RequestBody String product)
    {
        return product;
    }
}
