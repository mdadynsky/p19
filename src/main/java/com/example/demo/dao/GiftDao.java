package com.example.demo.dao;

import com.example.demo.dao.mapper.GiftRowMapper;
import com.example.demo.model.Gift;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class GiftDao extends BaseDao {

    public GiftDao(JdbcTemplate jdbcTemplate) {
        super(jdbcTemplate);
    }

    public List<Gift> getGiftList() {
        return jdbcTemplate.query("select * from gift", new GiftRowMapper());
    }

    public Gift getGiftById(Integer giftId) {
        List<Gift> gifts = jdbcTemplate.query(
                "select * from gift where id = ?",
                preparedStatement -> preparedStatement.setInt(1, giftId),
                new GiftRowMapper());


        if (gifts.isEmpty())
            return null;

        return gifts.get(0);
    }

    public void deleteGift(Integer giftId) {
        jdbcTemplate.update("delete from gift where id = " + giftId);
    }


    public void update(Gift gift) {
        jdbcTemplate.update(
                "update gift set giftname = ?, giftdescription = ?, giftprice = ? where id = ?",
                preparedStatement -> {
                    preparedStatement.setString(1, gift.getGiftName());
                    preparedStatement.setString(2, gift.getGiftDescription());
                    preparedStatement.setString(3, gift.getGiftPrice());
                    preparedStatement.setInt(4, gift.getId());
                });
    }

    public void insert(Gift promotion) {
        jdbcTemplate.update(
                "insert into promotion (promotionname, promotiondescription, promotionprice) values (?,?,?)",
                preparedStatement -> {
                    preparedStatement.setString(1, promotion.getGiftName());
                    preparedStatement.setString(2, promotion.getGiftDescription());
                    preparedStatement.setString(3, promotion.getGiftPrice());
                });
    }
}