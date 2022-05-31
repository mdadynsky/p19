package com.example.demo.web.admin.banner;

import com.example.demo.model.Banner;
import com.example.demo.service.BannerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * Автор: Ильин Эдуард
 */
@Controller
public class BannerController {
    private final BannerService bannerService;

    public BannerController(BannerService bannerService) {
        this.bannerService = bannerService;
    }

    @GetMapping("/admin/banner/banner")
    public String showUserList(Model model) {
        List<Banner> banners = bannerService.getBannerList();
        model.addAttribute("var1", "Hello world");
        model.addAttribute("banners", banners);
        return ("/admin/banner/banner");
    }
}
