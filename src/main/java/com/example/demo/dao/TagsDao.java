package com.example.demo.dao;

import com.example.demo.dao.mapper.TagsRowMapper;
import com.example.demo.model.Tags;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TagsDao extends BaseDao {
    public TagsDao(JdbcTemplate jdbcTemplate) {
        super(jdbcTemplate);
    }

    public List<Tags> getTagsList() {
        return jdbcTemplate.query("select * from tags", new TagsRowMapper());
    }

    public void deleteTags(Integer tagId) {
        jdbcTemplate.update("delete from tags where id = " + tagId);
    }
}
