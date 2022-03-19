package com.example.demo.dao.mapper;

import com.example.demo.model.Promo;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PromoRowMapper implements RowMapper {

    @Override
    public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
        Promo promo = new Promo();

        promo.setId(rs.getInt("id"));
        promo.setPromoName(rs.getString("promoName"));
        promo.setPromoDescription(rs.getString("promoDescription"));
        promo.setPromoPrice(rs.getString("promoPrice"));

        return promo;
    }
}