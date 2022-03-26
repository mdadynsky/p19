package com.example.demo.dao;

import com.example.demo.dao.mapper.UserRowMapper;
import com.example.demo.model.User;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.stereotype.Repository;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

@Repository
public class UserDao extends BaseDao {

    public UserDao(JdbcTemplate jdbcTemplate) {
        super(jdbcTemplate);
    }

    public List<Map<String, Object>> getUsers() {
        return jdbcTemplate.queryForList("select * from user");
    }

    public List<User> getUserList() {
        return jdbcTemplate.query("select * from user", new UserRowMapper());
    }

    public User getUserById(Integer userId) {
        List<User> users = jdbcTemplate.query(
                "select * from user where id = ?",
                preparedStatement -> preparedStatement.setInt(1, userId),
                new UserRowMapper());


        if (users.isEmpty())
            return null;

        return users.get(0);
    }

    public void deleteUser(Integer userId) {
        jdbcTemplate.update("delete from user where id = " + userId);
    }


    public void save(User user) {
        jdbcTemplate.update(
                "update user set username = ?, password = ? where id = ?",
                preparedStatement -> {
                    preparedStatement.setString(1, user.getUserName());
                    preparedStatement.setString(2, user.getPassword());
                    preparedStatement.setInt(3, user.getId());
                });
    }
}
