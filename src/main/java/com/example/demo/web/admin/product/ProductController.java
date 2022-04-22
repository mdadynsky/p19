package com.example.demo.web.admin.product;


import com.example.demo.dao.ProductDao;

import com.example.demo.model.Product;

import com.example.demo.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.Map;

/**
 * Автор: Андрей Котов
 */
@Controller
public class ProductController {

    private ProductService productService;

    private ProductController(ProductService productService, ProductDao productDao) {
        this.productService = productService;
    }

    @GetMapping("/admin//product/products")
    public String showProductList(Model model) {
        List<Map<String, Object>> listOfMaps = productService.getProduct();
        List<Product> products = productService.getProductList();

        model.addAttribute("products", products);
        return ("/admin/product/products");

    }
    @GetMapping("/admin/product/{productId}/delete")
    public String deleteProduct(@PathVariable Integer productId) {
        productService.deleteProduct(productId);
        return "redirect:/admin/product/products";
    }

    @GetMapping("/admin/products/create")
    public String showCreate(Model model) {

        model.addAttribute("product", new Product());
        return "admin/promo/editproduct";
    }
    @GetMapping("/admin/product/{productId}/edit")
    public String showproductEdit(@PathVariable Integer productId, Model model) {
        Product product = productService.getProductById(productId);
        model.addAttribute("Product", product);
        return "admin/product/editproduct";
    }
    @PostMapping("/admin/product/{productId}/edit")
    public String saveproductEdit(
            @ModelAttribute Product product,
            @PathVariable Integer productId) {
        product.setId(productId);
        System.out.println("Сохранение  " + productId);

        productService.save(product);
        return "redirect:/admin/product/products";
    }
    @PostMapping("/admin/product/create")
    public String saveproductEdit(
            @ModelAttribute Product product) {
        productService.save(product);
        return "redirect:/admin/product/product";
    }
}
