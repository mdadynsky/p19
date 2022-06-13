package com.example.demo.dao.mapper;

import com.example.demo.model.Tags;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class TagsRowMapper implements RowMapper {

    @Override
    public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
        Tags tag = new Tags();
        tag.setId(rs.getInt("id"));
        tag.setTagName(rs.getString("tagName"));
        return tag;
    }
}
