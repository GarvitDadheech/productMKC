package dev.garvit.productservices.controllers;

import dev.garvit.productservices.models.Category;
import dev.garvit.productservices.models.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class CategoryController {
    @GetMapping("/categories")
    public List<Category> getAllCategories(){
        return new ArrayList<>();
    }
    @GetMapping("/categories/{id}")
    public List<Product> getProductInCategory(@PathVariable("id") Category category){
        return new ArrayList<Product>();
    }
}
