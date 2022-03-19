package com.example.demo.dao.mapper;

import com.example.demo.model.Delivery;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DeliveryRowMapper implements RowMapper {

    @Override
    public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
        Delivery delivery = new Delivery();

        delivery.setId(rs.getInt("id"));
        delivery.setCompanyName(rs.getString("companyName"));

        return delivery;
    }
}
