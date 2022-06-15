package com.example.demo.web.admin.promotion;

import com.example.demo.model.Promotion;
import com.example.demo.service.PromotionService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
/**
 * Спсиок скидок
 * Автор: Андрей Воронков
 */
@Controller
public class PromotionController {

    private final PromotionService promotionService;

    public PromotionController(PromotionService promotionService) {
        this.promotionService = promotionService;
    }

    @GetMapping("/admin/promotion/promotion")
    public String showPromotions(Model model) {
        List<Promotion> promotions = promotionService.getPromotionList();
        model.addAttribute("promotions", promotions);
        return "admin/promotion/promotion";
    }

    @GetMapping("/admin/promotion/{promotionId}/delete")
    public String deletePromotion(@PathVariable Integer promotionId) {
        promotionService.deletePromotion(promotionId);
        return "redirect:/admin/promotion/promotion";
    }

    @GetMapping("/admin/promotion/create")
    public String showCreate(Model model) {

        model.addAttribute("promotion", new Promotion());
        return "admin/promotion/editpromotion";
    }

    @GetMapping("/admin/promotion/{promotionId}/edit")
    public String showpromoEdit(@PathVariable Integer promotionId, Model model) {
        Promotion promotion = promotionService.getPromotionById(promotionId);
        model.addAttribute("promotion", promotion);
        return "admin/promotion/editpromotion";
    }

    @PostMapping("/admin/promotion/{promotionId}/edit")
    public String savepromoEdit(
            @ModelAttribute Promotion promotion,
            @PathVariable Integer promotionId) {
        promotion.setId(promotionId);
        System.out.println("Сохранние пользователя " + promotionId);

        promotionService.save(promotion);
        return "redirect:/admin/promotion/promotion";
    }

    @PostMapping("/admin/promotion/create")
    public String savepromotionEdit(
            @ModelAttribute Promotion promotion) {
        promotionService.save(promotion);
        return "redirect:/admin/promotion/promotion";
    }
}