package com.example.demo.web.admin.promo;

import com.example.demo.model.Promo;
import com.example.demo.service.PromoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

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

    @GetMapping("/admin/promo/{promoId}/delete")
    public String deletePromo(@PathVariable Integer promoId) {
        promoService.deletePromo(promoId);
        return "redirect:/admin/promo/promo";
    }

    @GetMapping("/admin/promo/create")
    public String showCreate(Model model) {

        model.addAttribute("promo", new Promo());
        return "admin/promo/editpromo";
    }

    @GetMapping("/admin/promo/{promoId}/edit")
    public String showpromoEdit(@PathVariable Integer promoId, Model model) {
        Promo promo = promoService.getPromoById(promoId);
        model.addAttribute("promo", promo);
        return "admin/promo/editpromo";
    }

    @PostMapping("/admin/promo/{promoId}/edit")
    public String savepromoEdit(
            @ModelAttribute Promo promo,
            @PathVariable Integer promoId) {
        promo.setId(promoId);
        System.out.println("Сохранние пользователя " + promoId);

        promoService.save(promo);
        return "redirect:/admin/promo/promo";
    }

    @PostMapping("/admin/promo/create")
    public String savepromoEdit(
            @ModelAttribute Promo promo) {
        promoService.save(promo);
        return "redirect:/admin/promo/promo";
    }
}
