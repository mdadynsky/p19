package com.example.demo.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class UserDao extends BaseDao{

    public UserDao(JdbcTemplate jdbcTemplate) {
        super(jdbcTemplate);
    }

    public List<Map<String, Object>> getUsers(){
        return jdbcTemplate.queryForList("select * from user");
    }
}
