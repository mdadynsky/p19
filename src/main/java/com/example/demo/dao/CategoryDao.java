package com.example.demo.dao;

import com.example.demo.dao.mapper.CategoryRowMapper;
import com.example.demo.model.Category;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CategoryDao extends BaseDao {
    public CategoryDao(JdbcTemplate jdbcTemplate) {
        super(jdbcTemplate);
    }

    public List<Category> getCategoryList() {
        return jdbcTemplate.query("select * from category", new CategoryRowMapper());
    }
}
