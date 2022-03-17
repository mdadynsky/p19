package com.example.demo.web.admin.delivery;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Способы доставки
 * Автор: Данил Важов
 */
@Controller
public class DeliveryController {
    @GetMapping("/admin/delivery/delivery")
    public String showProductList(){return ("/admin/delivery/delivery"); }
}
