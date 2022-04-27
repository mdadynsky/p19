package com.example.demo.web.admin.banner;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Автор: Ильин Эдуард
 */
@Controller
public class BannerController {
    @GetMapping("/admin/banner/banner")
    public String showUserList() {
        return ("/admin/banner/banner");
    }
}
