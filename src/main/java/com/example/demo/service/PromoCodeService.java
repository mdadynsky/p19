package com.example.demo.service;

import com.example.demo.dao.PromoCodeDao;
import com.example.demo.model.PromoCode;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PromoCodeService {
    private final PromoCodeDao promoCodeDao;

    public PromoCodeService(PromoCodeDao promoCodeDao) {
        this.promoCodeDao = promoCodeDao;
    }

    public List<PromoCode> getPromoCodeList() {
        return promoCodeDao.getPromoCodeList();
    }

    public PromoCode getPromoCodeById(Integer promoCodeId) {
        return promoCodeDao.getPromoCodeById(promoCodeId);
    }

    public void deletePromoCode(Integer promoCodeId) {
        promoCodeDao.deletePromoCode(promoCodeId);
    }

    public void save(PromoCode promoCode) {
        if (promoCode.getId() == null)
            promoCodeDao.insert(promoCode);
        else
            promoCodeDao.update(promoCode);
    }
}
