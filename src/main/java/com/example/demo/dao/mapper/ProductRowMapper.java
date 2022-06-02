package com.example.demo.dao.mapper;

import com.example.demo.model.Product;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductRowMapper implements RowMapper {
    @Override
    public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
        Product product = new Product();

        product.setId(rs.getInt("id"));
        product.setProductAge(rs.getString("productAge"));
        product.setProductName(rs.getString("productName"));
        product.setProductType(rs.getString("productType"));
        product.setProductCost(rs.getDouble("productCost"));
        product.setProducer(rs.getString("productProducer"));
        product.setRating(rs.getInt("rating"));
        product.setRatingCount(rs.getInt("ratingCount"));

        return product;
    }
}

