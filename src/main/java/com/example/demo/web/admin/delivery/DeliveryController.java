package com.example.demo.web.admin.delivery;

import com.example.demo.model.Delivery;
import com.example.demo.service.DeliveryService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * Способы доставки
 * Автор: Данил Важов
 */
@Controller
public class DeliveryController {

    private final DeliveryService deliveryService;

    public DeliveryController(DeliveryService deliveryService) {
        this.deliveryService = deliveryService;
    }

    @GetMapping("/admin/delivery/delivery")
    public String showDeliveryList(Model model){
        List<Delivery> delivery = deliveryService.getDeliveryList();
        model.addAttribute("delivery", delivery);
        return ("/admin/delivery/delivery");
    }
}
