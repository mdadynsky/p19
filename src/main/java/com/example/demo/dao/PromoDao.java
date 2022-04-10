package com.example.demo.dao;

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

    public Promo getPromoById(Integer promoId) {
        List<Promo> promos = jdbcTemplate.query(
                "select * from promo where id = ?",
                preparedStatement -> preparedStatement.setInt(1, promoId),
                new PromoRowMapper());


        if (promos.isEmpty())
            return null;

        return promos.get(0);
    }

    public void deletePromo(Integer promoId) {
        jdbcTemplate.update("delete from promo where id = " + promoId);
    }


    public void update(Promo promo) {
        jdbcTemplate.update(
                "update promo set promoname = ?, promodescription = ?, promoprice = ? where id = ?",
                preparedStatement -> {
                    preparedStatement.setString(1, promo.getPromoName());
                    preparedStatement.setString(2, promo.getPromoDescription());
                    preparedStatement.setString(3, promo.getPromoPrice());
                    preparedStatement.setInt(4, promo.getId());
                });
    }

    public void insert(Promo promo) {
        jdbcTemplate.update(
                "insert into promo (promoname, promodescription, promoprice) values (?,?,?)",
                preparedStatement -> {
                    preparedStatement.setString(1, promo.getPromoName());
                    preparedStatement.setString(2, promo.getPromoDescription());
                    preparedStatement.setString(3, promo.getPromoPrice());
                });
    }
}
