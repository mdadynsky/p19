package com.example.demo.service;

import com.example.demo.dao.CategoryDao;
import com.example.demo.model.Category;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    private final CategoryDao categoryDao;

    public CategoryService(CategoryDao categoryDao) {
        this.categoryDao = categoryDao;
    }

    public List<Category> getCategoryList() {
        return categoryDao.getCategoryList();
    }
}
