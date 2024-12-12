package com.example.productserviceaws.services;

import com.example.productserviceaws.exceptions.ProductNotFoundException;
import com.example.productserviceaws.models.Product;

import java.util.List;

public interface ProductService {
    Product getProductById(Long id) throws ProductNotFoundException;

    List<Product> getAllProducts();

    Product replaceProduct(Long id, Product product);

    Product createProduct(Product product);

    //Creating a createProduct method which returns void in order to test the doNothing() and verify() methods for JUnit test
    void createProductVoid(Product product);
}
