package com.example.demo.web.admin.delivery;

import com.example.demo.model.Delivery;
import com.example.demo.service.DeliveryService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/admin/delivery")
public class DeliveryApiController {

    private final DeliveryService deliveryService;

    public DeliveryApiController(DeliveryService deliveryService) {
        this.deliveryService = deliveryService;
    }

    @RequestMapping(value = "/delivery")
    public List<Delivery> getDelivery() {
        return deliveryService.getDeliveryList();
    }
}
