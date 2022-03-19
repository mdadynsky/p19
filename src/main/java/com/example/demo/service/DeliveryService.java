package com.example.demo.service;

import com.example.demo.dao.DeliveryDao;
import com.example.demo.model.Delivery;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeliveryService {
    private final DeliveryDao deliveryDao;

    public DeliveryService(DeliveryDao deliveryDao) {
        this.deliveryDao = deliveryDao;
    }

    public List<Delivery> getDeliveryList() {
        return deliveryDao.getDeliveryList();
    }
}
