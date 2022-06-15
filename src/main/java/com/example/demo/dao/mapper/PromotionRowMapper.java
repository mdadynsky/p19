package com.example.demo.dao.mapper;

import com.example.demo.model.Promotion;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PromotionRowMapper implements RowMapper {

    @Override
    public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
        Promotion promotion = new Promotion();

        promotion.setId(rs.getInt("id"));
        promotion.setPromotionName(rs.getString("promotionName"));
        promotion.setPromotionDescription(rs.getString("promotionDescription"));
        promotion.setPromotionPrice(rs.getString("promotionPrice"));

        return promotion;
    }
}