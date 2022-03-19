package com.example.demo.web.admin.promo;

import com.example.demo.model.Promo;
import com.example.demo.service.PromoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PromoApiController {
    private final PromoService promoService;

    public PromoApiController(PromoService promoService) {
        this.promoService = promoService;
    }

    @RequestMapping("/api/promo")
    public List<Promo> getPromo() {
        return promoService.getPromoList();
    }
}
