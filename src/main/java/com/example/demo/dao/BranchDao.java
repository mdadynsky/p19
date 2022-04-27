package com.example.demo.dao;

import com.example.demo.dao.BaseDao;
import com.example.demo.dao.mapper.BranchRowMapper;
import com.example.demo.model.Branch;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
    public class BranchDao extends BaseDao {
        public BranchDao(JdbcTemplate jdbcTemplate) {
            super(jdbcTemplate);
        }
    public List<Branch> getBranchList() {
        return jdbcTemplate.query("select * from branch", new BranchRowMapper());
    }
    }

