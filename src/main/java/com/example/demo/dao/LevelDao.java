package com.example.demo.dao;

import com.example.demo.dao.mapper.LevelRowMapper;
import com.example.demo.model.Level;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class LevelDao extends BaseDao {

    public LevelDao(JdbcTemplate jdbcTemplate) {
        super(jdbcTemplate);
    }

    public List<Level> getLevelList() {
        return jdbcTemplate.query("select * from level", new LevelRowMapper());
    }

    public Level getLevelById(Integer levelId) {
        List<Level> levels = jdbcTemplate.query(
                "select * from level where id = ?",
                preparedStatement -> preparedStatement.setInt(1, levelId),
                new LevelRowMapper());


        if (levels.isEmpty())
            return null;

        return levels.get(0);
    }

    public void deleteLevel(Integer levelId) {
        jdbcTemplate.update("delete from level where id = " + levelId);
    }


    public void update(Level level) {
        jdbcTemplate.update(
                "update level set levelname = ?, levelTotalAmountOfPurchases = ? where id = ?",
                preparedStatement -> {
                    preparedStatement.setString(1, level.getLevelName());
                    preparedStatement.setInt(2, level.getLevelTotalAmountOfPurchases());
                    preparedStatement.setInt(3, level.getId());
                });
    }

    public void insert(Level level) {
        jdbcTemplate.update(
                "insert into level (levelname, levelTotalAmountOfPurchases) values (?,?)",
                preparedStatement -> {
                    preparedStatement.setString(1, level.getLevelName());
                    preparedStatement.setInt(2, level.getLevelTotalAmountOfPurchases());
                });
    }
}
