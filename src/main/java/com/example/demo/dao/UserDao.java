package com.example.demo.dao;

import com.example.demo.dao.mapper.UserRowMapper;
import com.example.demo.model.User;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

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

    public User getUserByName(String userName) {
        List<User> users = jdbcTemplate.query(
                "select * from user where username = ?",
                preparedStatement -> preparedStatement.setString(1, userName),
                new UserRowMapper());


        if (users.isEmpty())
            return null;

        return users.get(0);
    }

    public void deleteUser(Integer userId) {
        jdbcTemplate.update("delete from user where id = " + userId);
    }


    public void update(User user) {
        jdbcTemplate.update(
                "update user set username = ?, password = ?, phone = ? where id = ?",
                preparedStatement -> {
                    preparedStatement.setString(1, user.getUserName());
                    preparedStatement.setString(2, user.getPassword());
                    preparedStatement.setString(3, user.getPhone());
                    preparedStatement.setInt(4, user.getId());
                });
    }

    public void insert(User user) {
        jdbcTemplate.update(
                "insert into user (username, password, phone) values (?,?,?)",
                preparedStatement -> {
                    preparedStatement.setString(1, user.getUserName());
                    preparedStatement.setString(2, user.getPassword());
                    preparedStatement.setString(3, user.getPhone());
                });

    }
}
