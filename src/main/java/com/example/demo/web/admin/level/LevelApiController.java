package com.example.demo.web.admin.level;

import com.example.demo.model.Level;
import com.example.demo.service.LevelService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LevelApiController {
    private final LevelService levelService;

    public LevelApiController(LevelService levelService) {
        this.levelService = levelService;
    }

    @RequestMapping("/api/level")
    public List<Level> getLevel() {
        return levelService.getLevelList();
    }
}
