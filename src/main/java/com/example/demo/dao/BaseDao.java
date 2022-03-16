package com.example.demo.dao;

import org.springframework.jdbc.core.JdbcTemplate;

public class BaseDao {
    protected final JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public BaseDao(final JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
