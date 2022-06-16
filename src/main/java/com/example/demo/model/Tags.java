package com.example.demo.model;

import java.io.Serializable;

public class Tags implements Serializable {
    private Integer id;
    private String tagName;
    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public String getTagName() {
        return tagName;
    }
    public void setTagName(String tagName) {
        this.tagName = tagName;
    }
}
