package com.example.demo.service;

import com.example.demo.dao.BranchDao;
import com.example.demo.model.Branch;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BranchService {
    private final BranchDao branchDao;

    public BranchService(BranchDao branchDao) {
        this.branchDao = branchDao;
    }

    public List<Branch> getBranchList() {
        return branchDao.getBranchList();
    }
}
