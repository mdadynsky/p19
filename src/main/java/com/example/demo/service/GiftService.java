package com.example.demo.service;

import com.example.demo.dao.GiftDao;
import com.example.demo.model.Gift;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GiftService {
    private final GiftDao giftDao;

    public GiftService(GiftDao giftDao) {
        this.giftDao = giftDao;
    }

    public List<Gift> getGiftList() {
        return giftDao.getGiftList();
    }

    public Gift getGiftById(Integer giftId) {
        return giftDao.getGiftById(giftId);
    }

    public void deleteGift(Integer giftId) {
        giftDao.deleteGift(giftId);
    }

    public void save(Gift gift) {
        if (gift.getId() == null)
            giftDao.insert(gift);
        else
            giftDao.update(gift);
    }
}

