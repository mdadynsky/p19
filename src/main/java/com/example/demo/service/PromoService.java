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

    public Promo getPromoById(Integer promoId) {
        return promoDao.getPromoById(promoId);
    }

    public void deletePromo(Integer promoId) {
        promoDao.deletePromo(promoId);
    }

    public void save(Promo promo) {
        if (promo.getId() == null)
            promoDao.insert(promo);
        else
            promoDao.update(promo);
    }
}
