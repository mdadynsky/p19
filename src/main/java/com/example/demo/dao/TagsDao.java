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

    public Tags getTagById(Integer tagId) {
        List<Tags> tag = jdbcTemplate.query(
                "select * from tags where id = (?)",
                preparedStatement -> preparedStatement.setInt(1, tagId),
                new TagsRowMapper());

        if (tag.isEmpty())
            return null;

        return tag.get(0);
    }



    public void insert(Tags tag) {
        jdbcTemplate.update(
                "insert into tags (tagName) values ?",
                preparedStatement -> {
                    preparedStatement.setString(1, tag.getTagName());
                });
    }

    public void update(Tags tag) {
        jdbcTemplate.update(
                "update tags set tagName = ? where id = ?",
                preparedStatement -> {
                    preparedStatement.setString(1, tag.getTagName());
                    preparedStatement.setInt(2, tag.getId());
                });
    }
}
