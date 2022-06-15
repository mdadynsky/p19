package com.example.demo.service;

import com.example.demo.dao.TagsDao;
import com.example.demo.model.Tags;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TagsService {
    private final TagsDao tagsDao;

    public TagsService(TagsDao tagsDao) {
        this.tagsDao = tagsDao;
    }

    public List<Tags> getTagsList() {
        return tagsDao.getTagsList();
    }

    public void deleteTags(Integer tagId) {
        tagsDao.deleteTags(tagId);
    }
    public Tags getTagById(Integer tagId) {
        return tagsDao.getTagById(tagId);
    }
    public void save(Tags tag) {
        if (tag.getId() == null)
            tagsDao.insert(tag);
        else
            tagsDao.update(tag);
    }
}
