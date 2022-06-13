package com.example.demo.web.admin.tags;

import com.example.demo.model.Tags;
import com.example.demo.service.TagsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;
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
    @GetMapping("/admin/tags/{tagId}/edit")
    public String showTagEdit(@PathVariable Integer tagId, Model model) {
        Tags tag = tagsService.getTagById(tagId);
        model.addAttribute("tags", tag);
        return "/admin/tags/edittags";
    }

    @GetMapping("/admin/tags/create")
    public String showTagCreate(Model model, HttpSession session) {
        String v1 = (String) session.getAttribute("v1");

        model.addAttribute("tags", new Tags());
        model.addAttribute("v1", v1);
        return "/admin/tags/edittags";
    }
    @PostMapping("/admin/tags/create")
    public String saveTagEdit(
            @ModelAttribute Tags tag) {
        tagsService.save(tag);
        return "redirect:/admin/tags/tags";
    }

    @PostMapping("/admin/tags/{tagId}/edit")
    public String saveTagEdit(
            @ModelAttribute Tags tag,
            @PathVariable Integer tagId) {
        tag.setId(tagId);
        System.out.println("Сохранние тега " + tagId);
        tagsService.save(tag);
        return "redirect:/admin/tags/tags";
    }
}
