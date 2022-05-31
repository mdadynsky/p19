package com.example.demo.web.admin.points;

import com.example.demo.model.Points;
import com.example.demo.service.PointsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

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

    @GetMapping("/admin/points/poines")

    public String showPoines(Model model) {

        List<Points> poines = pointsService.getPointsList();
        model.addAttribute("poines", poines);
        return "admin/points/poines";
    }


}
