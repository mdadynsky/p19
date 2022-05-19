package com.example.demo.web.admin.points;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * Список пунктов доставки
 * Автор: Золотарев Илья
 */
@Controller
public class PointController {


    @GetMapping("/admin/point/points")
    public String showPoints(Model model) {
        return "admin/point/points";
    }

}
