package com.example.demo.model;

import java.io.Serializable;

public class PromoCode implements Serializable {
    private Integer id;
    private String promoCodeName;
    private Integer promoCodeDiscount;
    private String promoCodeNumbers;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPromoCodeName() {
        return promoCodeName;
    }

    public void setPromoCodeName(String promoCodeName) {
        this.promoCodeName = promoCodeName;
    }

    public Integer getPromoCodeDiscount() {
        return promoCodeDiscount;
    }

    public void setPromoCodeDiscount(Integer promoCodeDiscount) {
        this.promoCodeDiscount = promoCodeDiscount;
    }
    public String getPromoCodeNumbers() {
        return promoCodeNumbers;
    }

    public void setPromoCodeNumbers(String promoCodeNumbers) {
        this.promoCodeNumbers = promoCodeNumbers;
    }
}
