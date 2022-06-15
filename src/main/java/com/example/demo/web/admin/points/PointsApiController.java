package com.example.demo.web.admin.points;

import com.example.demo.model.Points;
import com.example.demo.service.PointsService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PointsApiController {
    private final PointsService pointsService;

    public PointsApiController(PointsService pointsService) {
        this.pointsService = pointsService;
    }

    @RequestMapping("/api/points")
    public List<Points> getPoints() {
        return pointsService.getPointsList();
    }
}