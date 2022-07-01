package com.example.demo.web.admin.promocode;

import com.example.demo.model.PromoCode;
import com.example.demo.service.PromoCodeService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PromoCodeApiController {
    private final PromoCodeService promoCodeService;

    public PromoCodeApiController(PromoCodeService promoCodeService) {
        this.promoCodeService = promoCodeService;
    }

    @RequestMapping("/api/promocode")
    public List<PromoCode> getPromoCode() {
        return promoCodeService.getPromoCodeList();
    }
}
