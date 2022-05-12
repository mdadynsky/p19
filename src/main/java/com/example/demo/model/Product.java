package com.example.demo.model;

import java.io.Serializable;

public class Product implements Serializable {

    private Integer id;
    private String productName;
    private String productAge;
    private String productType;
    private String producer;
    private Double productCost;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductAge() {
        return ((productAge == null) ? "0" : productAge) + "+";
    }

    public void setProductAge(String productAge) {
        this.productAge = productAge;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public Double getProductCost() {
        return productCost;
    }

    public void setProductCost(Double productCost) {
        this.productCost = productCost;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }
}
