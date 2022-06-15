package com.example.demo.web.admin.points;

import com.example.demo.model.Points;
import com.example.demo.service.PointsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

/**
 * Список пунктов доставки
 * Автор: Золотарев Илья
 */
@Controller
public class PointsController {

    private final PointsService pointsService;

    public PointsController(PointsService pointsService) {
        this.pointsService = pointsService;
    }

    @GetMapping("/admin/points/points")
    public String showPointes(Model model) {

        List<Points> pointes = pointsService.getPointsList();
        model.addAttribute("pointes", pointes);
        return "admin/points/points";
    }

    @GetMapping("/admin/points/{pointsId}/delete")
    public String deletePoints(@PathVariable Integer pointsId) {
        pointsService.deletePoints(pointsId);
        return "redirect:/admin/points/points";
    }

    @GetMapping("/admin/points/create")
    public String showCreate(Model model) {

        model.addAttribute("points", new Points());
        return "admin/points/editpoints";
    }

    @GetMapping("/admin/points/{pointsId}/edit")
    public String showpointsEdit(@PathVariable Integer pointsId, Model model) {
        Points points = pointsService.getPointsById(pointsId);
        model.addAttribute("points", points);
        return "admin/points/editpoints";
    }

    @PostMapping("/admin/points/{pointsId}/edit")
    public String savepointsEdit(
            @ModelAttribute Points points,
            @PathVariable Integer pointsId) {
        points.setId(pointsId);
        System.out.println("Сохранние пользователя " + pointsId);

        pointsService.save(points);
        return "redirect:/admin/points/points";
    }

    @PostMapping("/admin/points/create")
    public String savepointsEdit(
            @ModelAttribute Points points) {
        pointsService.save(points);
        return "redirect:/admin/points/points";
    }
}