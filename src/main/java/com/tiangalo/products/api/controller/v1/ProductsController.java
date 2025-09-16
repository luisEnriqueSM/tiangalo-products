package com.tiangalo.products.api.controller.v1;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductsController {

    @GetMapping
    ResponseEntity list(){
        return ResponseEntity.ok().build();
    }
}
