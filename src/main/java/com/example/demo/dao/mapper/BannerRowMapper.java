package com.example.demo.dao.mapper;

import com.example.demo.model.Banner;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class BannerRowMapper implements RowMapper {

    @Override
    public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
        Banner banner = new Banner();

        banner.setId(rs.getInt("id"));
        banner.setBannerName(rs.getString("name"));

        return banner;
    }
}