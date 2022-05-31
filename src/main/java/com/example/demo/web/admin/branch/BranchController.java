package com.example.demo.web.admin.branch;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

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