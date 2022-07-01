package com.example.demo.web.admin.gift;

import com.example.demo.model.Gift;
import com.example.demo.service.GiftService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GiftApiController {
    private final GiftService giftService;

    public GiftApiController(GiftService giftService) {
        this.giftService = giftService;
    }

    @RequestMapping("/api/gift")
    public List<Gift> getGift() {
        return giftService.getGiftList();
    }
}
