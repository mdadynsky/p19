package com.example.demo.dao;

import com.example.demo.dao.mapper.CityRowMapper;
import com.example.demo.model.City;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CityDao extends BaseDao {

    public CityDao(JdbcTemplate jdbcTemplate) {
        super(jdbcTemplate);
    }

    public List<City> getCityList() {
        return jdbcTemplate.query("select * from city", new CityRowMapper());
    }

    public City getCityById(Integer cityId) {
        List<City> cities = jdbcTemplate.query(
                "select * from city where id = ?",
                preparedStatement -> preparedStatement.setInt(1, cityId),
                new CityRowMapper());


        if (cities.isEmpty())
            return null;

        return cities.get(0);
    }

    public void deleteCity(Integer cityId) {
        jdbcTemplate.update("delete from city where id = " + cityId);
    }


    public void update(City city) {
        jdbcTemplate.update(
                "update city set cityname = ?, cityregion = ?, citywarehouses = ? where id = ?",
                preparedStatement -> {
                    preparedStatement.setString(1, city.getCityName());
                    preparedStatement.setString(2, city.getCityRegion());
                    preparedStatement.setInt(3, city.getCityWarehouses());
                    preparedStatement.setInt(4, city.getId());
                });
    }

    public void insert(City city) {
        jdbcTemplate.update(
                "insert into city (cityname, cityregion, citywarehouses) values (?,?,?)",
                preparedStatement -> {
                    preparedStatement.setString(1, city.getCityName());
                    preparedStatement.setString(2, city.getCityRegion());
                    preparedStatement.setInt(3, city.getCityWarehouses());
                });
    }
}
