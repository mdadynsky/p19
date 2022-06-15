package com.example.demo.web.admin.promo;

import com.example.demo.model.Promotion;
import com.example.demo.service.PromotionService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PromotionApiController {
    private final PromotionService promotionService;

    public PromotionApiController(PromotionService promotionService) {
        this.promotionService = promotionService;
    }

    @RequestMapping("/api/promotion")
    public List<Promotion> getPromotion() {
        return promotionService.getPromotionList();
    }
}