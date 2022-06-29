package com.example.demo.dao.mapper;

import com.example.demo.model.Level;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class LevelRowMapper implements RowMapper {

    @Override
    public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
        Level level = new Level();

        level.setId(rs.getInt("id"));
        level.setLevelName(rs.getString("levelName"));
        level.setLevelTotalAmountOfPurchases(rs.getInt("levelTotalAmountOfPurchases"));

        return level;
    }
}