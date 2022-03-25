package com.example.demo.dao.mapper;

import com.example.demo.model.Producer;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ProducerRowMapper implements RowMapper {

    @Override
    public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
        Producer producer = new Producer();

        producer.setId(rs.getInt("id"));
        producer.setProducerName(rs.getString("producerName"));
        producer.setProducerCountry(rs.getString("producerCountry"));

        return producer;
    }
}
