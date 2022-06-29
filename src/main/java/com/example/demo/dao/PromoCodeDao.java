package com.example.demo.dao;

import com.example.demo.dao.mapper.PromoCodeRowMapper;
import com.example.demo.model.PromoCode;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PromoCodeDao extends BaseDao {

    public PromoCodeDao(JdbcTemplate jdbcTemplate) {
        super(jdbcTemplate);
    }

    public List<PromoCode> getPromoCodeList() {
        return jdbcTemplate.query("select * from promoCode", new PromoCodeRowMapper());
    }

    public PromoCode getPromoCodeById(Integer promoCodeId) {
        List<PromoCode> promoCodes = jdbcTemplate.query(
                "select * from promoCode where id = ?",
                preparedStatement -> preparedStatement.setInt(1, promoCodeId),
                new PromoCodeRowMapper());


        if (promoCodes.isEmpty())
            return null;

        return promoCodes.get(0);
    }

    public void deletePromoCode(Integer promoCodeId) {
        jdbcTemplate.update("delete from promoCode where id = " + promoCodeId);
    }


    public void update(PromoCode promoCode) {
        jdbcTemplate.update(
                "update promoCode set promoCodename = ?, promoCodeDiscount = ?, promoCodeNumbers = ? where id = ?",
                preparedStatement -> {
                    preparedStatement.setString(1, promoCode.getPromoCodeName());
                    preparedStatement.setInt(2, promoCode.getPromoCodeDiscount());
                    preparedStatement.setString(3, promoCode.getPromoCodeNumbers());
                    preparedStatement.setInt(4, promoCode.getId());
                });
    }

    public void insert(PromoCode promoCode) {
        jdbcTemplate.update(
                "insert into promoCode (promoCodename, promoCodeDiscount, promoCodeNumbers) values (?,?,?)",
                preparedStatement -> {
                    preparedStatement.setString(1, promoCode.getPromoCodeName());
                    preparedStatement.setInt(2, promoCode.getPromoCodeDiscount());
                    preparedStatement.setString(3, promoCode.getPromoCodeNumbers());
                });
    }
}
