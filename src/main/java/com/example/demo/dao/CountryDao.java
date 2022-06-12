package com.example.demo.dao;

import com.example.demo.dao.mapper.CountryRowMapper;
import com.example.demo.model.Country;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CountryDao extends BaseDao {

    public CountryDao(JdbcTemplate jdbcTemplate) {
        super(jdbcTemplate);
    }

    public List<Country> getCountryList() {
        return jdbcTemplate.query("select * from country", new CountryRowMapper());
    }

    public Country getCountryById(Integer countryId) {
        List<Country> country = jdbcTemplate.query(
                "select * from country where id = ?",
                preparedStatement -> preparedStatement.setInt(1, countryId),
                new CountryRowMapper());


        if (country.isEmpty())
            return null;

        return country.get(0);
    }

    public void deleteCountry(Integer countryId) {
        jdbcTemplate.update("delete from country where id = " + countryId);
    }


    public void update(Country country) {
        jdbcTemplate.update(
                "update country set countryName = ? where id = ?",
                preparedStatement -> {
                    preparedStatement.setString(1, country.getCountryName());
                    preparedStatement.setInt(2, country.getId());
                });
    }

    public void insert(Country country) {
        jdbcTemplate.update(
                "insert into country (countryName) values (?)",
                preparedStatement -> {
                    preparedStatement.setString(1, country.getCountryName());
                });
    }
}
