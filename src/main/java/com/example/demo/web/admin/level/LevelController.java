package com.example.demo.web.admin.level;

import com.example.demo.model.Level;
import com.example.demo.service.LevelService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

/**
 * Список уровней покупателей
 * Автор: Пангаева Арина
 */

@Controller
public class LevelController {

    private final LevelService levelService;

    public LevelController(LevelService levelService) {
        this.levelService = levelService;
    }

    @GetMapping("/admin/level/level")
    public String showLevels(Model model) {
        List<Level> levels = levelService.getLevelList();
        model.addAttribute("levels", levels);
        return "admin/level/level";
    }

    @GetMapping("/admin/level/{levelId}/delete")
    public String deleteLevel(@PathVariable Integer levelId) {
        levelService.deleteLevel(levelId);
        return "redirect:/admin/level/level";
    }

    @GetMapping("/admin/level/create")
    public String showCreate(Model model) {

        model.addAttribute("level", new Level());
        return "admin/level/editlevel";
    }

    @GetMapping("/admin/level/{levelId}/edit")
    public String showlevelEdit(@PathVariable Integer levelId, Model model) {
        Level level = levelService.getLevelById(levelId);
        model.addAttribute("level", level);
        return "admin/level/editlevel";
    }

    @PostMapping("/admin/level/{levelId}/edit")
    public String savelevelEdit(
            @ModelAttribute Level level,
            @PathVariable Integer levelId) {
        level.setId(levelId);
        System.out.println("Сохранение уровня покупателя " + levelId);

        levelService.save(level);
        return "redirect:/admin/level/level";
    }

    @PostMapping("/admin/level/create")
    public String savelevelEdit(
            @ModelAttribute Level level) {
        levelService.save(level);
        return "redirect:/admin/level/level";
    }
}
