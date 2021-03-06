package com.example.demo.web;

import com.example.demo.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    private final ProductService productService;

    public IndexController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("products", productService.getProductList());
        return "index";
    }

    @GetMapping("/login")
    public String showDemo() {
        return "login";
    }

}
