package com.example.demo.web.admin.category;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
/**
 * Автор: Даниил Харитонов
 */

@Controller
public class CategoryController {

    @GetMapping("/admin/category/categories")
    public String showUserList() {
        return "admin/category/categories";
    }

}
