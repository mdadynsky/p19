package com.example.demo.web.admin.branch;

import com.example.demo.model.Category;
import com.example.demo.service.CategoryService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * Список филиалов
 * Автор: Шипилов Владислав
 */

@Controller
public class BranchController {
    @GetMapping("/admin//branch/branch")
    public String showBranch() {
        return ("/admin/branch/branch");
    }
}