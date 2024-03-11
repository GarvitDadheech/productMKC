package dev.garvit.productservices.controllers;

import dev.garvit.productservices.models.Product;
import dev.garvit.productservices.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class ProductController {
    private ProductService productService;
    public ProductController(ProductService productService){
        this.productService = productService;
    }
    @GetMapping("/products")
    public List<Product> getAllProducts(){
        return productService.getAllProducts();
    }
    @GetMapping("/products/{id}")
    public Product getSingleProduct(@PathVariable("id") Long id){
        return productService.getSingleProduct(id);
    }
    @PostMapping("/products")
    public Product createProduct(@RequestBody Product product){
        return productService.createProduct(product);
    }
    @PutMapping("/products/{id}")
    public void updateProduct(@RequestBody Product product,@PathVariable("id") Long id){
        productService.updateProduct(product,id);
    }
    @DeleteMapping("/products/id")
    public void deleteProduct(@PathVariable("id") Long id){
        productService.deleteProduct(id);
    }
    @GetMapping("/products/category/{name}")
    public List<Product> getProductsInCategory(@PathVariable("name") String name){
        return productService.getProductsInCategory(name);
    }

}
