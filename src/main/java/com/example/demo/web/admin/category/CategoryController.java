package com.example.demo.web.admin.category;

import com.example.demo.model.Category;
import com.example.demo.service.CategoryService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * Автор: Даниил Харитонов
 */

@Controller
public class CategoryController {

    private final CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping("/admin/category/categories")
    public String showCategories(Model model) {
        List<Category> categories = categoryService.getCategoryList();
        model.addAttribute("categories", categories);
        return "admin/category/categories";
    }

}
