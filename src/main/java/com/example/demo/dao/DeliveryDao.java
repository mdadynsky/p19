package com.example.demo.dao;

import com.example.demo.dao.mapper.DeliveryRowMapper;
import com.example.demo.model.Delivery;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DeliveryDao extends BaseDao {
    public DeliveryDao(JdbcTemplate jdbcTemplate) {
        super(jdbcTemplate);
    }

    public List<Delivery> getDeliveryList() {
        return jdbcTemplate.query("select * from delivery", new DeliveryRowMapper());
    }
}
