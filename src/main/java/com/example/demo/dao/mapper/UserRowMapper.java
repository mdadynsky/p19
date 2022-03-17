package com.example.demo.dao.mapper;

import com.example.demo.model.User;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserRowMapper implements RowMapper {

    @Override
    public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
        User user = new User();

        user.setId( rs.getInt("id"));
        user.setUserName( rs.getString("username"));
        user.setPassword( rs.getString("password"));

        return user;
    }
}
