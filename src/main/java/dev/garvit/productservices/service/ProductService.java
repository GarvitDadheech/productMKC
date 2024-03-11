package dev.garvit.productservices.service;

import dev.garvit.productservices.models.Product;

import java.util.List;

public interface ProductService {
     List<Product> getAllProducts();
     Product getSingleProduct(Long id);
     Product createProduct(Product product);
     void updateProduct(Product product,Long id);
     void deleteProduct(Long id);
     List<Product> getProductsInCategory(String category);

}
