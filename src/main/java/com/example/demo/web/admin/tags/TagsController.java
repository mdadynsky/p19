package com.example.demo.web.admin.tags;

import com.example.demo.model.Tags;
import com.example.demo.service.TagsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;


/**
 * Список тегов
 * Автор: Пожидаев Михаил
 */

@Controller
public class TagsController {
    private final TagsService tagsService;

    public TagsController(TagsService tagsService) {
        this.tagsService = tagsService;
    }

    @GetMapping("/admin/tags/tags")
    public String showTags(Model model) {
        List<Tags> tags = tagsService.getTagsList();
        model.addAttribute("tags", tags);
        return "/admin/tags/tags";
    }
    @GetMapping("/admin/tags/{tagId}/delete")
    public String deleteTags(@PathVariable Integer tagId) {
        tagsService.deleteTags(tagId);
        return "redirect:/admin/tags/tags";
    }
}
