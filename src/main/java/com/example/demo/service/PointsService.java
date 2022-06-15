package com.example.demo.service;

import com.example.demo.dao.PointsDao;
import com.example.demo.dao.PromotionDao;
import com.example.demo.model.Points;
import com.example.demo.model.Promotion;
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

    public Points getPointsById(Integer pointsId) {
        return pointsDao.getPointsById(pointsId);
    }

    public void deletePoints(Integer pointsId) {
        pointsDao.deletePoints(pointsId);
    }

    public void save(Points points) {
        if (points.getId() == null)
            pointsDao.insert(points);
        else
            pointsDao.update(points);
    }
}
