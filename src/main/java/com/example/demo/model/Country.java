package com.example.demo.model;

import java.io.Serializable;

public class Country implements Serializable {
    private Integer id;
    private String countryName;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }
}