package com.example.demo.dao.mapper;

import com.example.demo.model.Category;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CategoryRowMapper implements RowMapper {

    @Override
    public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
        Category category = new Category();

        category.setId(rs.getInt("id"));
        category.setCategoryName(rs.getString("category"));

        return category;
    }
}
