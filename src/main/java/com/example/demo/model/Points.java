package com.example.demo.model;

import java.io.Serializable;

public class Points implements Serializable {
    private Integer id;
    private String pointsName;
    private String pointsDescription;
    private String pointsPrice;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPointsName() {
        return pointsName;
    }

    public void setPointsName(String pointsName) {
        this.pointsName = pointsName;
    }

    public String getPointsDescription() {
        return pointsDescription;
    }

    public void setPointsDescription(String pointsDescription) {
        this.pointsDescription = pointsDescription;
    }

    public String getPointsPrice() {
        return pointsPrice;
    }

    public void setPointsPrice(String pointsPrice) {
        this.pointsPrice = pointsPrice;
    }
}