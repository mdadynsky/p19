package com.example.demo.dao;

import com.example.demo.dao.mapper.PointsRowMapper;
import com.example.demo.model.Points;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PointsDao extends BaseDao {

    public PointsDao(JdbcTemplate jdbcTemplate) {
        super(jdbcTemplate);
    }

    public List<Points> getPointsList() {
        return jdbcTemplate.query("select * from points", new PointsRowMapper());
    }

    public Points getPointsById(Integer pointsId) {
        List<Points> pointes = jdbcTemplate.query(
                "select * from points where id = ?",
                preparedStatement -> preparedStatement.setInt(1, pointsId),
                new PointsRowMapper());


        if (pointes.isEmpty())
            return null;

        return pointes.get(0);
    }

    public void deletePoints(Integer pointsId) {
        jdbcTemplate.update("delete from points where id = " + pointsId);
    }


    public void update(Points points) {
        jdbcTemplate.update(
                "update points set pointsname = ?, pointsdescription = ?, pointsprice = ? where id = ?",
                preparedStatement -> {
                    preparedStatement.setString(1, points.getPointsName());
                    preparedStatement.setString(2, points.getPointsDescription());
                    preparedStatement.setString(3, points.getPointsPrice());
                    preparedStatement.setInt(4, points.getId());
                });
    }

    public void insert(Points points) {
        jdbcTemplate.update(
                "insert into points (pointsname, pointsdescription, pointsprice) values (?,?,?)",
                preparedStatement -> {
                    preparedStatement.setString(1, points.getPointsName());
                    preparedStatement.setString(2, points.getPointsDescription());
                    preparedStatement.setString(3, points.getPointsPrice());
                });
    }
}