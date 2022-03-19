package com.example.demo.dao;

import com.example.demo.dao.BaseDao;
import com.example.demo.dao.mapper.PromoRowMapper;
import com.example.demo.model.Promo;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PromoDao extends BaseDao {
    public PromoDao(JdbcTemplate jdbcTemplate) {
        super(jdbcTemplate);
    }

    public List<Promo> getPromoList() {
        return jdbcTemplate.query("select * from promo", new PromoRowMapper());
    }
}
