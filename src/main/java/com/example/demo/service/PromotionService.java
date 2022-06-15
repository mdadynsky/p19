package com.example.demo.service;

import com.example.demo.dao.PromotionDao;
import com.example.demo.model.Promotion;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PromotionService {
    private final PromotionDao promotionDao;

    public PromotionService(PromotionDao promotionDao) {
        this.promotionDao = promotionDao;
    }

    public List<Promotion> getPromotionList() {
        return promotionDao.getPromotionList();
    }

    public Promotion getPromotionById(Integer promotionId) {
        return promotionDao.getPromotionById(promotionId);
    }

    public void deletePromotion(Integer promotionId) {
        promotionDao.deletePromotion(promotionId);
    }

    public void save(Promotion promotion) {
        if (promotion.getId() == null)
            promotionDao.insert(promotion);
        else
            promotionDao.update(promotion);
    }
}

