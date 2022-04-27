package com.example.demo.dao;

import com.example.demo.dao.BaseDao;
import com.example.demo.dao.mapper.BannerRowMapper;
import com.example.demo.model.Banner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BannerDao extends BaseDao {
    public BannerDao(JdbcTemplate jdbcTemplate) {
        super(jdbcTemplate);
    }

    public List<Banner> getBannerList() {
        return jdbcTemplate.query("select * from Banner", new BannerRowMapper());
    }
}