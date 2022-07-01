package com.example.demo.dao.mapper;

import com.example.demo.model.PromoCode;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PromoCodeRowMapper implements RowMapper {

    @Override
    public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
        PromoCode promoCode = new PromoCode();

        promoCode.setId(rs.getInt("id"));
        promoCode.setPromoCodeName(rs.getString("promoCodeName"));
        promoCode.setPromoCodeDiscount (rs.getInt("promoCodeDiscount"));
        promoCode.setPromoCodeNumbers (rs.getString("promoCodeNumbers"));

        return promoCode;
    }
}