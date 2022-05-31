package com.example.demo.web.admin.product;


import com.example.demo.model.Product;
import com.example.demo.service.ProductService;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

public class ProductApiController {

    private final ProductService productService;

    public ProductApiController(ProductService productService) {
        this.productService = productService;
    }

    @RequestMapping(value = "/api/product")
    public List<Product> getProduct() {
        return productService.getProductList();
    }

}
