package com.example.demo.dao;

import com.example.demo.dao.mapper.PointsRowMapper;
import com.example.demo.model.Points;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PointsDao extends BaseDao {
    public PointsDao(JdbcTemplate jdbcTemplate) {
        super(jdbcTemplate);
    }

    public List<Points> getPointsList() {
        return jdbcTemplate.query("select * from points", new PointsRowMapper());
    }
}
