package com.example.demo.web.admin.delivery;

import com.example.demo.model.Delivery;
import com.example.demo.service.DeliveryService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;
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
    @GetMapping("/admin/delivery/{deliveryId}/delete")
    public String deleteDelivery(@PathVariable Integer deliveryId) {
        deliveryService.deleteDelivery(deliveryId);
        return "redirect:/admin/delivery/delivery";
    }

    @GetMapping("/admin/delivery/create")
    public String showCreate(Model model) {

        model.addAttribute("delivery", new Delivery());
        return "admin/delivery/editdelivery";
    }

    @GetMapping("/admin/delivery/{deliveryId}/edit")
    public String showDeliveryEdit(@PathVariable Integer deliveryId, Model model) {
        Delivery delivery = deliveryService.getDeliveryById(deliveryId);
        model.addAttribute("delivery", delivery);
        return "admin/delivery/editdelivery";
    }

    @PostMapping("/admin/delivery/{deliveryId}/edit")
    public String saveDeliveryEdit(
            @ModelAttribute Delivery delivery,
            @PathVariable Integer deliveryId) {
        delivery.setId(deliveryId);
        System.out.println("Сохранить компанию " + deliveryId);

        deliveryService.save(delivery);
        return "redirect:/admin/delivery/delivery";
    }

    @PostMapping("/admin/delivery/create")
    public String saveDeliveryEdit(
            @ModelAttribute Delivery delivery) {
        deliveryService.save(delivery);
        return "redirect:/admin/delivery/delivery";
    }
}
