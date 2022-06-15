package com.example.demo.dao.mapper;


import com.example.demo.model.Points;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PointsRowMapper implements RowMapper {

    @Override
    public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
        Points points = new Points();

        points.setId(rs.getInt("id"));
        points.setPointsName(rs.getString("pointsName"));
        points.setPointsDescription(rs.getString("pointsDescription"));
        points.setPointsPrice(rs.getString("pointsPrice"));

        return points;
    }
}
