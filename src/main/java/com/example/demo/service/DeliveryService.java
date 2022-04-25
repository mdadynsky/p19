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

    public Delivery getDeliveryById(Integer deliveryId) {
        return deliveryDao.getDeliveryById(deliveryId);
    }

    public void deleteDelivery(Integer deliveryId) {
        deliveryDao.deleteDelivery(deliveryId);
    }

    public void save(Delivery delivery) {
        if (delivery.getId() == null)
            deliveryDao.insert(delivery);
        else
            deliveryDao.update(delivery);
    }
}
