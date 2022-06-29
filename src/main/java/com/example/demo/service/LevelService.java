package com.example.demo.service;

import com.example.demo.dao.LevelDao;
import com.example.demo.model.Level;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LevelService {
    private final LevelDao levelDao;

    public LevelService(LevelDao levelDao) {
        this.levelDao = levelDao;
    }

    public List<Level> getLevelList() {
        return levelDao.getLevelList();
    }

    public Level getLevelById(Integer levelId) {
        return levelDao.getLevelById(levelId);
    }

    public void deleteLevel(Integer levelId) {
        levelDao.deleteLevel(levelId);
    }

    public void save(Level level) {
        if (level.getId() == null)
            levelDao.insert(level);
        else
            levelDao.update(level);
    }
}
