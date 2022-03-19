package com.example.demo.web.admin.promo;

import com.example.demo.model.Promo;
import com.example.demo.service.PromoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * Автор: Мжачих Юрий
 * Контроллер в котором будет редактироваться блок промо акций
 */

@Controller
public class PromoController {

    private final PromoService promoService;

    public PromoController(PromoService promoService) {
        this.promoService = promoService;
    }

    @GetMapping("/admin/promo/promo")
    public String showPromos(Model model) {
        List<Promo> promos = promoService.getPromoList();
        model.addAttribute("promos", promos);
        return "admin/promo/promo";
    }
}
