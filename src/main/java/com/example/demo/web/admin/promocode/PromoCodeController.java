package com.example.demo.web.admin.promocode;

import com.example.demo.model.PromoCode;
import com.example.demo.service.PromoCodeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

/**
 * Список промо кодов
 * Автор: Нестерова Алина
 */

@Controller
public class PromoCodeController {

    private final PromoCodeService promoCodeService;

    public PromoCodeController(PromoCodeService promoCodeService) {
        this.promoCodeService = promoCodeService;
    }

    @GetMapping("/admin/promocode/promocode")
    public String showPromoCodes(Model model) {
        List<PromoCode> promoCodes = promoCodeService.getPromoCodeList();
        model.addAttribute("promoCodes", promoCodes);
        return "admin/promocode/promocode";
    }

    @GetMapping("/admin/promocode/{promoCodeId}/delete")
    public String deletePromocode(@PathVariable Integer promoCodeId) {
        promoCodeService.deletePromoCode(promoCodeId);
        return "redirect:/admin/promocode/promocode";
    }

    @GetMapping("/admin/promocode/create")
    public String showCreate(Model model) {

        model.addAttribute("promoCode", new PromoCode());
        return "admin/promocode/editpromocode";
    }

    @GetMapping("/admin/promocode/{promoCodeId}/edit")
    public String showlevelEdit(@PathVariable Integer promoCodeId, Model model) {
        PromoCode promoCode = promoCodeService.getPromoCodeById(promoCodeId);
        model.addAttribute("promoCode", promoCode);
        return "admin/promocode/editpromocode";
    }

    @PostMapping("/admin/promocode/{promoCodeId}/edit")
    public String savepromoCodeEdit(
            @ModelAttribute PromoCode promoCode,
            @PathVariable Integer promoCodeId) {
        promoCode.setId(promoCodeId);
        System.out.println("Сохранение уровня покупателя " + promoCodeId);

        promoCodeService.save(promoCode);
        return "redirect:/admin/promocode/promocode";
    }

    @PostMapping("/admin/promocode/create")
    public String savepromoCodeEdit(
            @ModelAttribute PromoCode promoCode) {
        promoCodeService.save(promoCode);
        return "redirect:/admin/promocode/promocode";
    }
}
