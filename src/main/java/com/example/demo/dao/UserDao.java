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

    public void deleteUser(Integer userId) {
        jdbcTemplate.update("delete from user where id = " + userId);
    }
}
