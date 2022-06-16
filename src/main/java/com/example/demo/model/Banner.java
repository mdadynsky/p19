package com.example.demo.model;

import java.io.Serializable;

public class Banner implements Serializable {
    private Integer id;
    private String bannerName;

    public String getBannerName() {
        return bannerName;
    }

    public void setBannerName(String bannerName) {
        this.bannerName = bannerName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

}