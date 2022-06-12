package com.example.demo.dao.mapper;

import com.example.demo.model.Country;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CountryRowMapper implements RowMapper {

    @Override
    public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
        Country country = new Country();

        country.setId(rs.getInt("id"));
        country.setCountryName(rs.getString("countryName"));

        return country;
    }
}
