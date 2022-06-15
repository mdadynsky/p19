package com.example.demo.dao;

import com.example.demo.dao.mapper.PromotionRowMapper;
import com.example.demo.model.Promotion;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PromotionDao extends BaseDao {

    public PromotionDao(JdbcTemplate jdbcTemplate) {
        super(jdbcTemplate);
    }

    public List<Promotion> getPromotionList() {
        return jdbcTemplate.query("select * from promotion", new PromotionRowMapper());
    }

    public Promotion getPromotionById(Integer promotionId) {
        List<Promotion> promotions = jdbcTemplate.query(
                "select * from promotion where id = ?",
                preparedStatement -> preparedStatement.setInt(1, promotionId),
                new PromotionRowMapper());


        if (promotions.isEmpty())
            return null;

        return promotions.get(0);
    }

    public void deletePromotion(Integer promotionId) {
        jdbcTemplate.update("delete from promotion where id = " + promotionId);
    }


    public void update(Promotion promotion) {
        jdbcTemplate.update(
                "update promotion set promotionname = ?, promotiondescription = ?, promotionprice = ? where id = ?",
                preparedStatement -> {
                    preparedStatement.setString(1, promotion.getPromotionName());
                    preparedStatement.setString(2, promotion.getPromotionDescription());
                    preparedStatement.setString(3, promotion.getPromotionPrice());
                    preparedStatement.setInt(4, promotion.getId());
                });
    }

    public void insert(Promotion promotion) {
        jdbcTemplate.update(
                "insert into promotion (promotionname, promotiondescription, promotionprice) values (?,?,?)",
                preparedStatement -> {
                    preparedStatement.setString(1, promotion.getPromotionName());
                    preparedStatement.setString(2, promotion.getPromotionDescription());
                    preparedStatement.setString(3, promotion.getPromotionPrice());
                });
    }
}