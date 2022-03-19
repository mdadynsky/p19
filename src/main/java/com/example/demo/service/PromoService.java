package com.example.demo.service;

import com.example.demo.dao.PromoDao;
import com.example.demo.model.Promo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PromoService {
    private final PromoDao promoDao;

    public PromoService(PromoDao promoDao) {
        this.promoDao = promoDao;
    }

    public List<Promo> getPromoList() {
        return promoDao.getPromoList();
    }
}
