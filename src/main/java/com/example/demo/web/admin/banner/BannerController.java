package com.example.demo.web.admin.banner;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Автор: Ильин Эдуард
 */
@Controller
public class BannerController {
    @GetMapping("/admin/banner/banner")
    public String showUserList(Model model) {

        model.addAttribute("var1", "Hello world");
        return ("/admin/banner/banner");
    }
}
