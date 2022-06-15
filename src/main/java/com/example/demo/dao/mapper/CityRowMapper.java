package com.example.demo.dao.mapper;

import com.example.demo.model.City;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CityRowMapper implements RowMapper {

    @Override
    public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
        City city = new City();

        city.setId(rs.getInt("id"));
        city.setCityName(rs.getString("cityName"));
        city.setCityRegion(rs.getString("cityRegion"));
        city.setCityWarehouses(rs.getInt("cityWarehouses"));

        return city;
    }
}
