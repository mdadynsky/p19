package com.example.demo.service;

import com.example.demo.dao.PointsDao;
import com.example.demo.model.Points;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PointsService {
    private final PointsDao pointsDao;

    public PointsService(PointsDao pointsDao) {
        this.pointsDao = pointsDao;
    }

    public List<Points> getPointsList() {
        return pointsDao.getPointsList();
    }
}
