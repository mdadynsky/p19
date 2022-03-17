package com.example.demo.web.admin.promo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Автор: Мжачих Юрий
 * Контроллер где будет редактироваться блок промо акций
 */

@Controller
public class PromoController {

    @GetMapping("/admin/promo/promo")
    public String showPromoList() {
        return "admin/promo/promo";
    }
}
