package com.example.demo.model;

import java.io.Serializable;

public class Branch implements Serializable {
    private Integer id;
    private String branchName;

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
