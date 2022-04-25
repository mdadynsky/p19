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

    public Delivery getDeliveryById(Integer deliveryId) {
        List<Delivery> delivery = jdbcTemplate.query(
                "select * from delivery where id = ?",
                preparedStatement -> preparedStatement.setInt(1, deliveryId),
                new DeliveryRowMapper());


        if (delivery.isEmpty())
            return null;

        return delivery.get(0);
    }

    public void deleteDelivery(Integer deliveryId) {
        jdbcTemplate.update("delete from delivery where id = " + deliveryId);
    }


    public void update(Delivery delivery) {
        jdbcTemplate.update(
                "update delivery set companyName = ? where id = ?",
                preparedStatement -> {
                    preparedStatement.setString(1, delivery.getCompanyName());
                    preparedStatement.setInt(2, delivery.getId());
                });
    }

    public void insert(Delivery delivery) {
        jdbcTemplate.update(
                "insert into delivery (companyName) values (?)",
                preparedStatement -> {
                    preparedStatement.setString(1, delivery.getCompanyName());
                });
    }
}
