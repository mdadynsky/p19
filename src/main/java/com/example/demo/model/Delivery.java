package com.example.demo.model;

import java.io.Serializable;

public class Delivery implements Serializable {
    private Integer id;
    private String companyName;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
