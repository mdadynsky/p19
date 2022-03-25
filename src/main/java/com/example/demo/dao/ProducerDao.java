package com.example.demo.dao;

import com.example.demo.dao.mapper.ProducerRowMapper;
import com.example.demo.model.Producer;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class ProducerDao extends BaseDao {

    public ProducerDao(JdbcTemplate jdbcTemplate) {
        super(jdbcTemplate);
    }

    public List<Map<String, Object>> getProducers() {
        return jdbcTemplate.queryForList("select * from producer");
    }

    public List<Producer> getProducerList() {
        return jdbcTemplate.query("select * from producer", new ProducerRowMapper());
    }
}
