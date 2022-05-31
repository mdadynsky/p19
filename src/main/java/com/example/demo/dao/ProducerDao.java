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

    public Producer getProducerById(Integer producerId) {
        List<Producer> producers = jdbcTemplate.query(
                "select * from producer where id = ?",
                preparedStatement -> preparedStatement.setInt(1, producerId),
                new ProducerRowMapper());

        if (producers.isEmpty())
            return null;

        return producers.get(0);
    }

    public Producer getProducerByName(String producerName) {
        List<Producer> producers = jdbcTemplate.query(
                "select * from producer where producerName = ?",
                preparedStatement -> preparedStatement.setString(1, producerName),
                new ProducerRowMapper());

        if (producers.isEmpty())
            return null;

        return producers.get(0);
    }

    public void deleteProducer(Integer producerId) {
        jdbcTemplate.update("delete from producer where id = " + producerId);
    }

    public void update(Producer producer) {
        jdbcTemplate.update(
                "update producer set producerName = ?, producerCountry = ? where id = ?",
                preparedStatement -> {
                    preparedStatement.setString(1, producer.getProducerName());
                    preparedStatement.setString(2, producer.getProducerCountry());
                    preparedStatement.setInt(3, producer.getId());
                });
    }

    public void insert(Producer producer) {
        jdbcTemplate.update(
                "insert into producer (producerName, producerCountry) values (?, ?)",
                preparedStatement -> {
                    preparedStatement.setString(1, producer.getProducerName());
                    preparedStatement.setString(2, producer.getProducerCountry());
                });
    }
}
