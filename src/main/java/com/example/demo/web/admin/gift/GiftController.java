package com.example.demo.web.admin.gift;

import com.example.demo.model.Gift;
import com.example.demo.service.GiftService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;



/**
 * Список подарочных карт
 * Автор: Кареев Марк
 */
@Controller
public class GiftController {

    Logger logger = LogManager.getLogger(com.example.demo.web.admin.gift.GiftController.class);

    private final GiftService giftService;

    public GiftController(GiftService giftService) {
        this.giftService = giftService;
    }

    @GetMapping("/admin/gift/gift")
    public String showGifts(Model model) {
        List<Gift> gifts = giftService.getGiftList();
        model.addAttribute("gifts", gifts);
        return "admin/gift/gift";
    }

    @GetMapping("/admin/gift/{giftId}/delete")
    public String deleteGift(@PathVariable Integer giftId) {
        giftService.deleteGift(giftId);
        return "redirect:/admin/gift/gift";
    }

    @GetMapping("/admin/gift/create")
    public String showCreate(Model model) {

        model.addAttribute("gift", new Gift());
        return "admin/gift/editgift";
    }

    @GetMapping("/admin/gift/{giftId}/edit")
    public String showpromoEdit(@PathVariable Integer giftId, Model model) {
        Gift gift = giftService.getGiftById(giftId);
        model.addAttribute("gift", gift);
        return "admin/gift/editgift";
    }

    @PostMapping("/admin/gift/{giftId}/edit")
    public String savePromoEdit(
            @ModelAttribute Gift gift,
            @PathVariable Integer giftId) {
        gift.setId(giftId);

        logger.debug("Сохранние промокода");

        giftService.save(gift);
        return "redirect:/admin/gift/gift";
    }

    @PostMapping("/admin/gift/create")
    public String savegiftEdit(
            @ModelAttribute Gift gift) {
        giftService.save(gift);
        return "redirect:/admin/gift/gift";
    }
}
.