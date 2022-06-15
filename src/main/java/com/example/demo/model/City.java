package com.example.demo.model;

public class City {
    private Integer id;
    private String cityName;
    private String cityRegion;
    private Integer cityWarehouses;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCityRegion() {
        return cityRegion;
    }

    public void setCityRegion(String cityRegion) {
        this.cityRegion = cityRegion;
    }

    public Integer getCityWarehouses() {
        return cityWarehouses;
    }

    public void setCityWarehouses(Integer cityWarehouses) {
        this.cityWarehouses = cityWarehouses;
    }
}
