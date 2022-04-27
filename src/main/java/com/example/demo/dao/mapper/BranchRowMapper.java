package com.example.demo.dao.mapper;

import com.example.demo.model.Branch;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;


    public class BranchRowMapper implements RowMapper {

        @Override
        public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
            Branch branch = new Branch();


            branch.setId(rs.getInt("id"));
            branch.setBranchName(rs.getString("branchName"));
            return branch;
        }
    }
