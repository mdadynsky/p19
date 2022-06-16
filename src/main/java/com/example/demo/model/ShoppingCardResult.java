package com.example.demo.model;

import java.io.Serializable;

public class ShoppingCardResult implements Serializable {
    String result;
    String user;
    Integer count;

    public String getUser() {
        return "customer";
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}
