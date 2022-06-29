package com.example.demo.model;

import java.io.Serializable;

public class Level implements Serializable {
    private Integer id;
    private String levelName;
    private String levelDescription;
    private Integer levelTotalAmountOfPurchases;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLevelName() {
        return levelName;
    }

    public void setLevelName(String levelName) {
        this.levelName = levelName;
    }

    public Integer getLevelTotalAmountOfPurchases() {
        return levelTotalAmountOfPurchases;
    }

    public void setLevelTotalAmountOfPurchases(Integer levelTotalAmountOfPurchases) {
        this.levelTotalAmountOfPurchases = levelTotalAmountOfPurchases;
    }
}
